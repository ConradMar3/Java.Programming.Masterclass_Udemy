package academy.learnprogramming;

public class LogicalAndOperator {
    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // Abbreviating:
        result++; // result ( 1 + 1 = 2 )
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("1 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("10 * 10 = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Is not an Alien.");
            System.out.println("Aliens are scary-ish.");
        }
        int topScore = 100;
        if (topScore == 100 ) {
            System.out.println("You got the high score!");
        }
        int noScore = 10;
        if ( noScore != 100 ) {
            System.out.println("No score!");
        }
        int higherThanScore = 100;
        if ( higherThanScore > 99 ) {
            System.out.println("Score is more than 99!");
        }
        int equalToOrGreater = 100;
        if ( equalToOrGreater >= 100 ) {
            System.out.println("Equal or greater than 100");
        }
        int less = 10;
        if(less<10) {
            System.out.println("Less");
        }
    }
}
