package lamada;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bichen on 9/4/16.
 */
public class LambdaTest001 {
    public static void main(String[] args) {
        LambdaTest001 test001 = new LambdaTest001();
        test001.simple_tst();
        System.out.println("end of simple test");

        System.out.println("start of collection sort test");
        test001.collection_sort_test();
        System.out.println("End of collection sort test");


    }

    private void simple_tst() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        for (String player : players) {
            System.out.println(player + "; ");
        }
        System.out.println("*******************************");
        players.forEach((player) -> System.out.println(player + ":" + "\n"));


        System.out.println("*****************************");

        players.forEach(System.out::println);
    }


    private void collection_sort_test(){
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        Arrays.sort(players,(String s1,String s2) -> s1.compareTo(s2));
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);

        }


    }


}
