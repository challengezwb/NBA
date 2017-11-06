package javabean;

import java.util.List;

/**
 * Created by zhupd on 4/18/2017.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Query q = new Query();
        TodayQuery tq = new TodayQuery();
        /*String[] res = q.winRateForTwoTeam
                (new String[]{"Lake", "Mag", "2006-04-18", "2016-10-18"});

        for (String x : res) {
            System.out.println(x);
        }*/

        //List<List<String[]>> t = tq.todayData("2006-04-18");

     /*   List<String[]> s = t.get(0);
        for (String[] x : s) {
            System.out.println(x[0] + x[1] + x[2]);
        }*/
/*
        for(int i=1;i<9;i++) {
            System.out.println(tq.topPlayerPoints("2006-04-18",i).get(i-1)[0] +" " + tq.topPlayerPoints("2006-04-18",i).get(i-1)[1]
            +" " + tq.topPlayerPoints("2006-04-18",i).get(i-1)[2]);*/
        //System.out.println(tq.topPlayerPoints("2006-04-18",i).get(0)[1]);
/*
        List<String[]> res = q.query4("UTA", "2006-01-01", "2006-01-15");
        System.out.println(res.get(0)[0]);
        System.out.println(res.get(0)[1]);*/
        System.out.println(q.getPlayerName("Shandon Anderson")[0] + q.getPlayerName("Shandon Anderson")[5]);

        System.out.println(q.getTeamName("Bulls")[0] + q.getTeamName("Bulls")[2]);
    }

        //tq.topPlayerPoints("2006-10-13", 3);
      /*
        System.out.println(tq.topPlayerPoints("2006-04-18",3).get(0)[0]);
        System.out.println(tq.topPlayerPoints("2006-04-18",3).get(0)[1]);
*/

/*
       System.out.println(q.test());*/

}
