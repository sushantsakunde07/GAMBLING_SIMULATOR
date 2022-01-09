package Gambling;

public class Gambling {
    public static void main(String[] args) {
        int win = 0;
        int loose = 0;
        for (int i = 0; i < 20; i++) {
            int stake = 100;
            while (stake < 150 && stake > 50) {
                int TRIAL = (int) Math.floor(Math.random() * 2);
                if (TRIAL == 0) {
                    // System.out.println("Gambler won the game");
                    stake++;
                } else {
                    //  System.out.println("Gambler loose the game");
                    stake--;
                }
            }
            if (stake == 150) {
                win++;
            } else if (stake == 50) {
                loose++;
            }
            {
                System.out.println("Gambler having stake after bet are of $ " + stake);
            }
        }
        {
            int stakeFINAL = win * 50 - loose * 50 + 100;
            System.out.println("Gambler having stake after 20 days $ " + stakeFINAL);
        }

    }
}