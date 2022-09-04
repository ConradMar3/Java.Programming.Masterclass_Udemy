package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Conrad",100);
        System.out.println("New score is: " + newScore);

        calculateScore(75);

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, or score.");
        return 0;
    }

    /*
    public static void calculateScore() {
        System.out.println("No player name, or score.");
    }

    NOTE: Can't just change the method type (int != void)
     */
}
