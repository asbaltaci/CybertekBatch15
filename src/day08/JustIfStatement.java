package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in) ;

        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt() ;

        System.out.println("What is the speed limit?");

        int speedlimit = scan.nextInt();

        if ( currentSpeed >= speedlimit) {

            System.out.println(" You will be pulled over by police");
            System.out.println(" You will get ticket by police");
            System.out.println(" You will loose points");
            System.out.println(" You will go to court");
        }


        System.out.println("THE END");
    }
}
