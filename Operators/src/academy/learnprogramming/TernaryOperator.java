package academy.learnprogramming;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean isCar = true;
        if (isCar) {
            System.out.println("With a boolean, don't need to add equals signs.");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true.");
        }
    }
}
