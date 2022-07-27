package academy.learnprogramming;

public class OperatorPrecedenceAndOperatorChallenge {
    public static void main(String[] args) {
        //1. Create first var with value of 20.00
        double myFirstValue = 20.00d;

        //2. Create second var with value of 80.00
        double mySecondValue = 80.00d;

        //3. Add both values and multiply by 100.00
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;

        System.out.println("My values total: " + myValuesTotal);

        //4. Remainder
        double theRemainder = myValuesTotal % 40.00d;

        System.out.println("The remainder: " + theRemainder);

        //.5 Boolean if remainder #4 is 0
        boolean isNoRemainder = (theRemainder == 0) ? true : false;

        System.out.println("isNoRemainder: " + isNoRemainder);

        //.6 if-then Statement
        if(!isNoRemainder) {
            System.out.println("Got a remainder.");
        }
    }
}
