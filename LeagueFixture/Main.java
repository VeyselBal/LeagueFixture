package LeagueFixture;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç takým gireceksiniz?");
        ArrayList<String> teams = new ArrayList<>();
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            String value=inp.next();
            teams.add(value);
        }

        League league =new League();

        if (n%2==0){
            league.FixtureEven(teams);
        }
        else {
            league.FixtureOdd(teams);
        }
    }
}
