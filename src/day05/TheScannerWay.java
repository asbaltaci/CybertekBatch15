package day05;

import java.util.Scanner;

public class TheScannerWay {
    public static void main(String[] args) {


        // ask user for name
        // and capture the result
        // print your name is
        // ask user for the birth year
        //capture that result
        // print the age
        //ask user the height
        // capture the result

        // Create scanner object

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        //String name= "Sam";
        String name = scan.next();

        System.out.println("When did you born?");
        int year = scan.nextInt();

        System.out.println("How tall are you?");
        double height = scan.nextDouble();

        System.out.println("I am "+name + " and I was born in "+year+ " and I am "+height);






    }
}
