package day04;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        // I want to save users input after asking some questions
        // I want to save this input to do smtg later

        // Step 1: Use scanner class to create scanner object
        // that have this functionality

        Scanner scan = new Scanner(System.in);

        // ask user to enter name
        // capture what user type on keyboard in console
        // print the result of what we saved from user input
        System.out.println("Enter your first name please : ");
        String firstName = scan.next();
        System.out.println("You have entered : "+ firstName);


        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);


    }

}
