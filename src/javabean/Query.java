package javabean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhupd on 4/18/2017.
 */
public class Query extends Connect{




    public List<String[]> topTeamPoints() throws Exception {
        this.startConnect();
        ResultSet rs = stmt.executeQuery("select * from\n" +
                "(select CITY, NICKNAME, PTS from MATCH_STATS, TEAM_COMMON_INFO\n" +
                "where GAME_DATE_EST = '2006-04-18T00:00:00'\n" +
                "and TEAM_COMMON_INFO.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                "order by PTS desc)\n" +
                "where rownum <= 4");
        List<String[]> res = new ArrayList<>();
        while (rs.next()) {
            String[] temp = new String[3];
            temp[0] = rs.getString(1);
            temp[1] = rs.getString(2);
            temp[2] = rs.getInt(3)+"";
            res.add(temp);

        }
        this.endConnect();
        return res;
    }

    /**
     *
     * @param qeury 1:team1, 2 team2, 3 startdate, 4 enddate  yy-mm-dd
     * @return String[]
     *   if null, no result
     * @throws Exception
     */
    public String[] winRateForTwoTeam(String[] qeury)  {
        try {
            this.startConnect();
            String team1 = qeury[0];
            String team2 = qeury[1];
            team1 = team1.substring(0, 3) + "%";
            team2 = team2.substring(0, 3) + "%";
            String startdate = qeury[2];
            String enddate = qeury[3];


            PreparedStatement stmt = con.prepareStatement("select w/gp, x.NICKNAME, x.CITY, x.ARENA, x.OWNER, x.HEADCOACH, \n" +
                    "y.NICKNAME, y.CITY, y.ARENA, y.OWNER, y.HEADCOACH from\n" +
                    "(select count(*) as gp from\n" +
                    "(select a.TEAM_ID_A, b.TEAM_ID_A ,a.pts, b.pts from MATCH_STATS a, MATCH_STATS b\n" +
                    "where a.GAME_ID_A = b.GAME_ID_A \n" +
                    "and a.TEAM_ID_A <> b.TEAM_ID_A\n" +
                    "and a.GAME_DATE_EST >= ?\n" +
                    "and a.GAME_DATE_EST <= ?\n" +
                    "and Lower(a.TEAM_NICKNAME) like Lower(?)\n" +
                    "and Lower(b.TEAM_NICKNAME) like Lower(?)\n" +
                    "))\n" +
                    ",\n" +
                    "(select count(*) as w from\n" +
                    "(select a.TEAM_ID_A, b.TEAM_ID_A ,a.pts, b.pts from MATCH_STATS a, MATCH_STATS b\n" +
                    "where a.GAME_ID_A = b.GAME_ID_A \n" +
                    "and a.TEAM_ID_A <> b.TEAM_ID_A\n" +
                    "and a.GAME_DATE_EST >= ?\n" +
                    "and a.GAME_DATE_EST <= ?\n" +
                    "and Lower(a.TEAM_NICKNAME) like Lower(?)\n" +
                    "and Lower(b.TEAM_NICKNAME) like Lower(?)\n" +
                    "and a.pts > b.pts\n" +
                    ")),\n" +
                    "(select NICKNAME, CITY, ARENA, OWNER, HEADCOACH from TEAM_COMMON_INFO where Lower(NICKNAME) like Lower(?)) x,\n" +
                    "(select NICKNAME, CITY, ARENA, OWNER, HEADCOACH from TEAM_COMMON_INFO where Lower(NICKNAME) like Lower(?)) y\n");

            stmt.setString(1, startdate);
            stmt.setString(2, enddate);
            stmt.setString(3, team1);
            stmt.setString(4, team2);
            stmt.setString(5, startdate);
            stmt.setString(6, enddate);
            stmt.setString(7, team1);
            stmt.setString(8, team2);
            stmt.setString(9, team1);
            stmt.setString(10, team2);

            String[] res = new String[9];
            ResultSet rs = stmt.executeQuery();


            if (rs.next()) {
                // System.out.println(rs.getDouble(1));

                res[0] = (int) (rs.getDouble(1) * 100) + "%";
                //System.out.println(res[0]);

                for (int i = 1; i <= 8; i++) {
                    res[i] = rs.getString(i + 1);
                    //System.out.println(res[i]);

                }
                this.endConnect();
                return res;
            } else {
                return null;
            }
        } catch (Exception e) {

        }
        return null;
    }


    /**
     *
     * @param s  yy-mm-dd
     * @return  Date object
     */
    public java.sql.Date parseDate(String s) {
        try {
            String[] res = s.split("-");
            return new java.sql.Date(Integer.parseInt(res[0]), Integer.parseInt(res[1]), Integer.parseInt(res[2]));
        } catch (Exception e) {

        }
        return null;
    }


    public List<String[]> query2(String state) {
        try {
            this.startConnect();
            PreparedStatement stmt = con.prepareStatement(" select * from\n" +
                    "  (select SCHOOL, sum(eff)/count(*) as efficiency from\n" +
                    "    (select * from\n" +
                    "      (select (avg(pts)+avg(AST)+avg(REB)+avg(STL)+avg(BLK)-(avg(FGA)-avg(FGM))-(avg(FTA)-avg(FTM)))\n" +
                    "      as eff, player_id from match_player_stats group by player_id)\n" +
                    "    where eff is not null) allPlayer, \n" +
                    "    PLAYER_COMMON_INFO \n" +
                    "  where allPlayer.player_id = PLAYER_COMMON_INFO.person_id\n" +
                    "  and lower(PLAYER_COMMON_INFO.LAST_AFFILIATION) like lower(?)\n" +
                    "  group by SCHOOL\n" +
                    "  order by sum(eff)/count(*) desc)\n" +
                    "where rownum <= 3");

            state = state.substring(0, 2) + "%";
            stmt.setString(1, state);
            ResultSet rs = stmt.executeQuery();
            List<String[]> res = new ArrayList<>();
            while (rs.next()) {
                String[] temp = new String[2];
                temp[0] = rs.getString(1);
                temp[1] = String.format("%.2f",rs.getDouble(2));
                res.add(temp);
            }
            this.endConnect();
            return res;

        } catch (Exception e) {
            return null;
        }
    }

    public List<String[]> query3(String date1, String date2) {
        try {
            this.startConnect();
            PreparedStatement stmt = con.prepareStatement("select PLAYER_NAME, rate, BIRTHDATE, SCHOOL, POSITION, TEAM_NAME\n" +
                    "from PLAYER_COMMON_INFO,\n" +
                    "(select PLAYER_ID, PLAYER_NAME, rate from\n" +
                    "(select w.PLAYER_ID, PLAYER_NAME, w.c/gp.c as rate from\n" +
                    "(select PLAYER_ID,PLAYER_NAME, count(*) as c from\n" +
                    "(select * from\n" +
                    "(select me.PLAYER_ID, PLAYER_NAME, mypts, yourpts from \n" +
                    "(select PLAYER_ID, MATCH_PLAYER_STATS.GAME_ID, MATCH_STATS.PTS as mypts ,PLAYER_NAME\n" +
                    "from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where GAME_DATE_EST >= ?\n" +
                    "and GAME_DATE_EST <= ?\n" +
                    "and MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A) me,\n" +
                    "(select  PLAYER_ID, MATCH_PLAYER_STATS.GAME_ID,\n" +
                    "MATCH_STATS.PTS as yourpts from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where GAME_DATE_EST >= ?\n" +
                    "and GAME_DATE_EST <= ?\n" +
                    "and MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID <> MATCH_STATS.TEAM_ID_A) you\n" +
                    "where you.GAME_ID = me.GAME_ID and you.PLAYER_ID = me.PLAYER_ID)\n" +
                    "where mypts > yourpts)\n" +
                    "group by PLAYER_ID, PLAYER_NAME) w\n" +
                    ",\n" +
                    "(select * from\n" +
                    "(select count(*)/2 as c,MATCH_PLAYER_STATS.PLAYER_ID from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where GAME_DATE_EST >= ?\n" +
                    "and GAME_DATE_EST <= ?\n" +
                    "and MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "group by MATCH_PLAYER_STATS.PLAYER_ID)\n" +
                    "where c > 6) gp\n" +
                    "where gp.PLAYER_ID = w.PLAYER_ID\n" +
                    "order by rate desc)\n" +
                    "where rownum <= 3) result\n" +
                    "where PLAYER_COMMON_INFO.PERSON_ID = result.PLAYER_ID\n" +
                    "order by rate desc\n");


            stmt.setString(1, date1);
            stmt.setString(2, date2);
            stmt.setString(3, date1);
            stmt.setString(4, date2);
            stmt.setString(5, date1);
            stmt.setString(6, date2);


            ResultSet rs = stmt.executeQuery();
            List<String[]> res = new ArrayList<>();
            while (rs.next()) {
                String[] temp = new String[6];

                temp[0] = rs.getString(1);
                temp[1] = (int) (rs.getDouble(2) * 100) + "%";
                temp[2] = rs.getString(3).substring(0, 10);
                temp[3] = rs.getString(4);
                temp[4] = rs.getString(5);
                temp[5] = rs.getString(6);
                res.add(temp);
            }
            return res;

        } catch (Exception e) {
            return null;
        }
    }

    public List<String[]> query4(String team, String date1, String date2) {
        String sqlDate1 = date1 + "T00:00:00";
        String sqlDate2 = date2 + "T00:00:00";


        try {
            this.startConnect();
            List<String[]> res = new ArrayList<>();

            PreparedStatement stmt = con.prepareStatement("select result.player_name, school, country from\n" +
                    "player_common_info,\n" +
                    "(select * from \n" +
                    "(select distinct player_id,player_name\n" +
                    "from MATCH_PLAYER_STATS, MATCH_STATS\n" +
                    "where team_abbreviation = ?\n" +
                    "and MATCH_STATS.game_id_a = MATCH_PLAYER_STATS.game_id\n" +
                    "and MATCH_STATS.team_id_a = MATCH_PLAYER_STATS.team_id\n" +
                    "and game_date_est >= ? \n" +
                    "and game_date_est <= ?) a \n" +
                    "where not exists\n" +
                    "(\n" +
                    "  (select distinct game_id from\n" +
                    "    (select * from MATCH_PLAYER_STATS, MATCH_STATS\n" +
                    "      where team_abbreviation = ?\n" +
                    "      and MATCH_STATS.game_id_a = MATCH_PLAYER_STATS.game_id\n" +
                    "      and MATCH_STATS.team_id_a = MATCH_PLAYER_STATS.team_id\n" +
                    "      and game_date_est >= ?\n" +
                    "      and game_date_est <= ?\n" +
                    "    )\n" +
                    "  )\n" +
                    "  minus\n" +
                    "  (select distinct game_id from\n" +
                    "    (select * from MATCH_PLAYER_STATS, MATCH_STATS\n" +
                    "      where MATCH_STATS.game_id_a = MATCH_PLAYER_STATS.game_id\n" +
                    "      and MATCH_STATS.team_id_a = MATCH_PLAYER_STATS.team_id\n" +
                    "    ) b\n" +
                    "    where b.player_id = a.player_id\n" +
                    "  )\n" +
                    ")) result\n" +
                    "where result.player_id = player_common_info.person_id");
            stmt.setString(1, team);
            stmt.setString(2, sqlDate1);
            stmt.setString(3, sqlDate2);
            stmt.setString(4, team);
            stmt.setString(5, sqlDate1);
            stmt.setString(6, sqlDate2);

            ResultSet rs = stmt.executeQuery();
            //System.out.println("tttttt");
           /* ResultSet rs = stmt.executeQuery("select result.player_name, school, country from\n" +
                    "player_common_info,\n" +
                    "(select * from \n" +
                    "(select distinct player_id,player_name\n" +
                    "from MATCH_PLAYER_STATS, MATCH_STATS\n" +
                    "where team_abbreviation = \'" +
                    team +
                    "\'\n" +
                    "and MATCH_STATS.game_id_a = MATCH_PLAYER_STATS.game_id\n" +
                    "and MATCH_STATS.team_id_a = MATCH_PLAYER_STATS.team_id\n" +
                    "and game_date_est >= \'" +
                    sqlDate1 +
                    "\' and game_date_est <= \'" +
                    sqlDate2 +
                    "\') a \n" +
                    "where not exists\n" +
                    "(\n" +
                    "  (select distinct game_id from\n" +
                    "    (select * from MATCH_PLAYER_STATS, MATCH_STATS\n" +
                    "      where team_abbreviation = \'" +
                    team +
                    "\'\n" +
                    "      and MATCH_STATS.game_id_a = MATCH_PLAYER_STATS.game_id\n" +
                    "      and MATCH_STATS.team_id_a = MATCH_PLAYER_STATS.team_id\n" +
                    "      and game_date_est >= \'" +
                    sqlDate1 +
                    "\' and game_date_est <= \'" +
                    sqlDate2 +
                    "\'\n" +
                    "    )\n" +
                    "  )\n" +
                    "  minus\n" +
                    "  (select distinct game_id from\n" +
                    "    (select * from MATCH_PLAYER_STATS, MATCH_STATS\n" +
                    "      where MATCH_STATS.game_id_a = MATCH_PLAYER_STATS.game_id\n" +
                    "      and MATCH_STATS.team_id_a = MATCH_PLAYER_STATS.team_id\n" +
                    "      and game_date_est >= \'" +
                    sqlDate1 +
                    "\' and game_date_est <= \'" +
                    sqlDate2 +
                    "\'\n" +
                    "    ) b\n" +
                    "    where b.player_id = a.player_id\n" +
                    "  )\n" +
                    ")) result\n" +
                    "where result.player_id = player_common_info.person_id");*/


            if (!rs.next()) {
                throw new Exception();
            } else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = rs.getString(3);
                res.add(temp);
                //System.out.println(temp[0]);
                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = rs.getString(3);
                    res.add(temp);
                }
            }

            this.endConnect();
            return res;

        } catch (Exception e) {
        }
        return null;
    }


    public String[] getPlayerName(String name) {
        try {
            this.startConnect();
            PreparedStatement stmt = con.prepareStatement("  select DISPLAY_FIRST_LAST, birthdate, school, \n" +
                    "  country, height, weight, position from \n" +
                    "  player_common_info where DISPLAY_FIRST_LAST = ?");
            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new Exception();
            } else {
                String[] res = new String[7];
                res[0] = rs.getString(1);
                res[1] = rs.getString(2);
                res[2] = rs.getString(3);
                res[3] = rs.getString(4);
                res[4] = rs.getString(5);
                res[5] = rs.getInt(6)+"";
                res[6] = rs.getString(7);
                this.endConnect();
                return res;
            }
        } catch (Exception e) {
            return null;
        }
    }


    public String[] getTeamName(String name) {
        try {
            this.startConnect();
            PreparedStatement stmt = con.prepareStatement("\n" +
                    "    select nickname, city, yearfounded, arena, headcoach from \n" +
                    "    TEAM_COMMON_INFO where nickname = ?");

            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new Exception();
            } else {
                String[] res = new String[5];
                res[0] = rs.getString(1);
                res[1] = rs.getString(2);
                res[2] = rs.getInt(3) + "";
                res[3] = rs.getString(4);
                res[4] = rs.getString(5);

                this.endConnect();
                return res;
            }
        } catch (Exception e) {
            return null;
        }
    }



    public int totalCount() {
        try {
            this.startConnect();


            ResultSet rs = stmt.executeQuery("select p1 + p2 + t1 + t2 + m1 + m2 + x from\n" +
                    "(select count(*) as p1 from player_by_year_stats),\n" +
                    "(select count(*) as p2 from PLAYER_COMMON_INFO),\n" +
                    "(select count(*) as t1 from TEAM_COMMON_INFO),\n" +
                    "(select count(*) as t2 from TEAM_EVERY_YEAR_INFO),\n" +
                    "(select count(*) as m1 from MATCH_PLAYER_STATS),\n" +
                    "(select count(*) as m2 from MATCH_STATS),\n" +
                    "(select count(*) as x from P_USER)");
            //System.out.println("sddsfsd");


            rs.next();
            int temp = rs.getInt(1);
            this.endConnect();

            return temp;
        } catch (Exception e) {

        }
        return 0;
    }


}
