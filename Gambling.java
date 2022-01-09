package Gambling;

public class Gambling {
    public static void main(String[] args) {
        int win =0;
        int loose = 0;
        int wincount=0;
        int loosecount=0;
        for (int i = 0; i < 20; i++) {
            int stake = 100;
            while (stake < 150 && stake > 50) {
                int TRIAL = (int) Math.floor(Math.random() * 2);
                if (TRIAL == 0) {
                    // System.out.println("Gambler won the game");
                    stake++;
                    wincount++;
                } else {
                    //  System.out.println("Gambler loose the game");
                    stake--;
                    loosecount++;
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
            System.out.println("Days won in month are "+win+" and loose are "+loose);
            System.out.println("Amount won is "+win*50+" and amount loose is "+loose*50);
            //System.out.println("Gambler having stake after 20 days $ " + stakeFINAL);
        }

    }
}