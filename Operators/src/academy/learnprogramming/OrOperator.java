package academy.learnprogramming;

public class OrOperator {
    public static void main(String[] args) {
        int topScore = 80;
        int secondScore = 60;
        if ((topScore > 90) || (secondScore < 90)) {
            System.out.println("Either or both conditions are true.");
        }
    }
}
