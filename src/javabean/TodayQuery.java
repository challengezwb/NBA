package javabean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhupd on 4/19/2017.
 */
public class TodayQuery extends Connect{



    /** for player page
     * first 8 th item
     *
     *
     * @return string[] as playerName, score, team
     * @throws Exception
     */
    public List<String[]> topPlayerPoints(String date, int type) {
        try {

            this.startConnect();
            String sqlDate = date + "T00:00:00";
            String temp = "";
            switch (type) {
                case 1:
                    temp = "PTS";
                    break;
                case 2:
                    temp = "REB";
                    break;
                case 3:
                    temp = "AST";
                    break;
                case 4:
                    temp = "BLK";
                    break;
                case 5:
                    temp = "STL";
                    break;
                case 6:
                    temp = "TURNOVER";
                    break;
                case 7:
                    temp = "FG3M";
                    break;
                case 8:
                    temp = "FTM";
                    break;
            }
            String item = "MATCH_PLAYER_STATS." + temp;

            //System.out.println(item);


            //item = "MATCH_PLAYER_STATS.AST";
            PreparedStatement stmt = con.prepareStatement("select PLAYER_NAME, TEAM_ABBREVIATION, P  from (\n" +
                    "select avg(" + item +
                    ") as p, player_id , player_name, TEAM_ABBREVIATION from MATCH_STATS, MATCH_PLAYER_STATS where \n" +
                    "MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A and\n" +
                    "GAME_DATE_EST = ?\n" +
                    "group by  player_id, player_name, TEAM_ABBREVIATION\n" +
                    "order by p desc)\n" +
                    "where p is not null and rownum <= 5");

            //stmt.setString(1, item);
       /* sqlDate = "2006-10-13T00:00:00";*/
            stmt.setString(1, sqlDate);
            ResultSet rs = stmt.executeQuery();
            List<String[]> res = new ArrayList<>();
            if(!rs.next())
                throw new Exception();
            else {

                String[] temp1 = new String[3];
                temp1[0] = rs.getString(1);
                //System.out.println(temp1[0]);

                temp1[1] = rs.getString(2);
                temp1[2] = rs.getInt(3) + "";
                res.add(temp1);

                while (rs.next()) {
                    temp1 = new String[3];
                    temp1[0] = rs.getString(1);
                    //System.out.println(temp1[0]);

                    temp1[1] = rs.getString(2);
                    temp1[2] = rs.getInt(3) + "";
                    res.add(temp1);
                }
            }
            this.endConnect();
            return res;
        } catch (Exception e) {
            return null;
        }
    }


    public List<String[]> player9(String date) {

        String sqlDate = date + "T00:00:00";
        try {
            this.startConnect();
            PreparedStatement stmt = con.prepareStatement("select PLAYER_NAME, TEAM_ABBREVIATION, eff  from (\n" +
                    "select avg(MATCH_PLAYER_STATS.pts)+avg(MATCH_PLAYER_STATS.AST)+avg(MATCH_PLAYER_STATS.REB)\n" +
                    "+avg(MATCH_PLAYER_STATS.STL)+avg(MATCH_PLAYER_STATS.BLK)\n" +
                    "-(avg(MATCH_PLAYER_STATS.FGA)-avg(MATCH_PLAYER_STATS.FGM))\n" +
                    "-(avg(MATCH_PLAYER_STATS.FTA)-avg(MATCH_PLAYER_STATS.FTM)) as eff, \n" +
                    "player_id , player_name, TEAM_ABBREVIATION from MATCH_STATS, MATCH_PLAYER_STATS where \n" +
                    "MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A and\n" +
                    "GAME_DATE_EST = ?\n" +
                    "group by  player_id, player_name, TEAM_ABBREVIATION\n" +
                    "order by eff desc)\n" +
                    "where eff is not null and rownum <= 5");

            stmt.setString(1, sqlDate);
            ResultSet rs = stmt.executeQuery();
            List<String[]> res = new ArrayList<>();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp1 = new String[3];
                temp1[0] = rs.getString(1);
                //System.out.println(temp1[0]);

                temp1[1] = rs.getString(2);
                temp1[2] = rs.getInt(3) + "";
                res.add(temp1);

                while (rs.next()) {
                    temp1 = new String[3];
                    temp1[0] = rs.getString(1);
                    //System.out.println(temp1[0]);

                    temp1[1] = rs.getString(2);
                    temp1[2] = rs.getInt(3) + "";
                    res.add(temp1);
                }
            }
            this.endConnect();
            return res;
        } catch (Exception e) {
            return null;
        }
    }

    public List<String[]> playerTotal(String date) {
        List<String[]> res = new ArrayList<>();

        for(int i=1;i<9;i++) {
            List<String[]> temp = topPlayerPoints(date, i);
            //System.out.println(temp.get(1)[0]);

            res.addAll(temp);
        }
        res.addAll(player9(date));
        return res;
    }


    public List<String[]> teamTotal(String date) {
        String sqlDate = date + "T00:00:00";
        //System.out.println("jajaja");
        List<String[]> res = new ArrayList<>();

        try {
            this.startConnect();

            //table 1
            PreparedStatement stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, PTS from MATCH_STATS, TEAM_COMMON_INFO\n" +
                    "where GAME_DATE_EST = ?\n" +
                    "and TEAM_COMMON_INFO.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "order by PTS desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            ResultSet rs = stmt.executeQuery();

            if(!rs.next()){
                throw new Exception();}
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);

                System.out.println(temp[0]);
                temp[1] = rs.getString(2);
                temp[2] = rs.getInt(3) + "";
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);

                    System.out.println(temp[0]);

                    temp[1] = rs.getString(2);
                    temp[2] = rs.getInt(3) + "";
                    res.add(temp);
                }
            }


            //table 2
            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, sum(REB) as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }


            //table 3

            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, sum(AST) as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }


            //table 4

            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, sum(BLK)as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }


            //table 5

            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, sum(STL)as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }


            //table 6
            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p*100 from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, avg(FG_PCT)as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }

            //table 7

            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, sum(FG3M)as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }

            //table 8

            stmt = con.prepareStatement("\n" +
                    "select * from\n" +
                    "(select NICKNAME, CITY, p*100 from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, avg(FG3_PCT)as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }


            //table 9

            stmt = con.prepareStatement("select * from\n" +
                    "(select NICKNAME, CITY, p*100 from\n" +
                    "team_common_info,\n" +
                    "(select TEAM_ID, avg(p) as p from\n" +
                    "(select TEAM_ID, GAME_ID, avg(FT_PCT)as p from\n" +
                    "(select * from MATCH_PLAYER_STATS, MATCH_STATS \n" +
                    "where MATCH_PLAYER_STATS.GAME_ID = MATCH_STATS.GAME_ID_A\n" +
                    "and MATCH_PLAYER_STATS.TEAM_ID = MATCH_STATS.TEAM_ID_A\n" +
                    "and GAME_DATE_EST = ?)\n" +
                    "group by TEAM_ID, GAME_ID)\n" +
                    "group by team_id) result\n" +
                    "where result.team_id = team_common_info.TEAM_ID\n" +
                    "order by p desc)\n" +
                    "where rownum <= 4");
            stmt.setString(1, sqlDate);
            rs = stmt.executeQuery();

            if(!rs.next())
                throw new Exception();
            else {
                String[] temp = new String[3];
                temp[0] = rs.getString(1);
                temp[1] = rs.getString(2);
                temp[2] = String.format("%.2f", rs.getDouble(3));
                res.add(temp);

                while (rs.next()) {
                    temp = new String[3];
                    temp[0] = rs.getString(1);
                    temp[1] = rs.getString(2);
                    temp[2] = String.format("%.2f", rs.getDouble(3));
                    res.add(temp);
                }
            }
            this.endConnect();
            return res;

        } catch (Exception e) {
            return null;
        }
    }

    public List<String[]> matchTotal(String date) {
        String sqlDate = date + "T00:00:00";
        try {
            this.startConnect();
            PreparedStatement stmt = con.prepareStatement("select a.game_id_a, a.team_nickname, a.PTS_QTR1, a.PTS_QTR2, a.PTS_QTR3, a.PTS_QTR4,a.pts,\n" +
                    "b.team_nickname, b.PTS_QTR1, b.PTS_QTR2, b.PTS_QTR3, b.PTS_QTR4,b.pts\n" +
                    "from\n" +
                    "(select GAME_ID_A, TEAM_ID_A,TEAM_NICKNAME,\n" +
                    "PTS_QTR1, PTS_QTR2, PTS_QTR3, PTS_QTR4, PTS from MATCH_STATS \n" +
                    "where GAME_DATE_EST = ?) a,\n" +
                    "(select GAME_ID_A, TEAM_ID_A,TEAM_NICKNAME,\n" +
                    "PTS_QTR1, PTS_QTR2, PTS_QTR3, PTS_QTR4, PTS from MATCH_STATS \n" +
                    "where GAME_DATE_EST = ?) b\n" +
                    "where a.game_id_a = b.game_id_a and a.team_nickname <> b.team_nickname");
            stmt.setString(1, sqlDate);
            stmt.setString(2, sqlDate);
            ResultSet rs = stmt.executeQuery();

            Set<Integer> matchSet = new HashSet<>();
            List<String[]> res = new ArrayList<>();
            if(!rs.next()){
                throw new Exception();
            }else {
                matchSet.add(rs.getInt(1));
                String[] team1 = new String[6];
                String[] team2 = new String[6];
                team1[0] = rs.getString(2);
                team1[1] = rs.getInt(3) + "";
                team1[2] = rs.getInt(4) + "";
                team1[3] = rs.getInt(5) + "";
                team1[4] = rs.getInt(6) + "";
                team1[5] = rs.getInt(7) + "";

                team2[0] = rs.getString(8);
                team2[1] = rs.getInt(9) + "";
                team2[2] = rs.getInt(10) + "";
                team2[3] = rs.getInt(11) + "";
                team2[4] = rs.getInt(12) + "";
                team2[5] = rs.getInt(13) + "";

                res.add(team1);
                res.add(team2);
                int i=1;
                while (rs.next()) {
                    if (matchSet.contains(rs.getInt(1))) {
                        continue;
                    } else {
                        matchSet.add(rs.getInt(1));
                        i++;
                        String[] t1 = new String[6];
                        String[] t2 = new String[6];
                        t1[0] = rs.getString(2);
                        t1[1] = rs.getInt(3) + "";
                        t1[2] = rs.getInt(4) + "";
                        t1[3] = rs.getInt(5) + "";
                        t1[4] = rs.getInt(6) + "";
                        t1[5] = rs.getInt(7) + "";

                        t2[0] = rs.getString(8);
                        t2[1] = rs.getInt(9) + "";
                        t2[2] = rs.getInt(10) + "";
                        t2[3] = rs.getInt(11) + "";
                        t2[4] = rs.getInt(12) + "";
                        t2[5] = rs.getInt(13) + "";

                        res.add(t1);
                        res.add(t2);

                        if (i >= 3) {
                            break;
                        }
                    }
                }
                if(i<3) throw new Exception();
            }
            return res;

        } catch (Exception e) {
            return null;
        }
    }


    public List<List<String[]>> todayData(String date) {

        List<List<String[]>> res = new ArrayList<>();
        res.add(playerTotal(date));
        res.add(teamTotal(date));
        res.add(matchTotal(date));

        return res;
    }
}
