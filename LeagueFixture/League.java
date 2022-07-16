package LeagueFixture;

import java.util.ArrayList;

public class League {


    public void FixtureEven(ArrayList teams) {

        int round = 1;

        String[] index = new String[teams.size() - 1];

        for (int i = 0; i < teams.size() - 1; i++) {
            index[i] = (String) teams.get(i + 1);
        }

        for (int i = 0; i < teams.size() - 1; i++) {

            System.out.println("Round: " + round);

            System.out.println(teams.get(0) + " vs " + index[index.length / 2]);
            for (int j = 0; j < teams.size() / 2 - 1; j++) {
                System.out.println(index[j] + " vs " + index[index.length - j - 1]);
            }

            round++;
            System.out.println("Round: " + round);
            System.out.println(index[index.length / 2] + " vs " + teams.get(0));
            for (int j = 0; j < teams.size() / 2 - 1; j++) {
                System.out.println(index[index.length - j - 1] + " vs " + index[j]);
            }

            MixEven(index);
            round++;
        }
    }

    public void FixtureOdd(ArrayList teams) {
        int round = 1;

        String[] index = new String[teams.size()];

        for (int i = 0; i < teams.size(); i++) {
            index[i] = (String) teams.get(i);
        }

        for (int i = 0; i < teams.size() + 1; i++) {

            System.out.println("Round: " + round);

            System.out.println(index[index.length / 2] + " vs " + "Bay");
            for (int j = 0; j < teams.size() / 2; j++) {

                System.out.println(index[j] + " vs " + index[index.length - j - 1]);
            }

            round++;
            System.out.println("Round: " + round);

            System.out.println("Bay" + " vs " + index[index.length / 2]);
            for (int j = 0; j < teams.size() / 2 ; j++) {
                System.out.println(index[index.length - j - 1] + " vs " + index[j]);
            }

            MixOdd(index);
            round++;
        }
    }

    private void MixOdd(String[] arr) {
        String value = arr[arr.length-1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
    }

    private void MixEven(String[] arr) {
        String value = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
    }
}
