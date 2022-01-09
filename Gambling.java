package Gambling;

public class Gambling {
    public static void main(String[] args) {
        int STAKE = 100;
        System.out.println("Gambler start with stake of $" + STAKE);
        int TRIAL = (int) Math.floor(Math.random() * 2);
        System.out.println(+TRIAL);
        if (TRIAL == 0) {
            System.out.println("Gambler won the game");
            STAKE++;
        } else {
            System.out.println("Gambler loose the game");
            STAKE--;
        }
        {
            System.out.println("Gambler having stake after bet are of $ " + STAKE);
        }

    }
}