package academy.learnprogramming;

public class AssignmentVsEquals {
    public static void main(String[] args) {
        int a = 50;
        if(a == 50){
            System.out.println("a is 50. Note the two equals!");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("With a boolean, don't need to add equals signs.");
        }
    }
}
