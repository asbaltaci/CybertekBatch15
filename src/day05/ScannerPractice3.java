package day05;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        // create a program to ask user for Fahrenheiht

            //Scanner scan = new Scanner(System.in);

            //System.out.println("What is the temperature in F");

            //double fahrenheit = scan.nextDouble();

            //double celcius = ( 5.0 / 9 ) * ( fahrenheit-32);

            //System.out.println("Fahrenheit "+ fahrenheit+ " is "+ celcius);


        // create a program to calculate how many min in an day?

        Scanner scan = new Scanner(System.in);
        System.out.println("How many hours are there in a day? ");
        int min = scan.nextInt();
        int day = 24*60;

        System.out.println( " In a day there are "+ day+" minutes ");

    }
}
