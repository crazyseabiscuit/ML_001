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
}
