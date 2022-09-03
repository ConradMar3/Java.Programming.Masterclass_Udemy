package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        // Java Statement:
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test" + "\n" + myVariable);

        //Indentation:
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        // Can write println in multi lines:
        System.out.println("\nThis is" +
                " another way" +
                " to write a println." +
                " \nUsed multiple lines.");

        // Can write multi statements in one line:
        int anotherVariable = 50;
        anotherVariable++;
        anotherVariable--;
        System.out.println("Another variable.");
        // NOTE: Don't do this, it can be confusing.

    }
}
