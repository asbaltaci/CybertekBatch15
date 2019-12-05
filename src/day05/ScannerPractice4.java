package day05;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
// Task 4 :
//    *  Create an interactive program to ask user for hourly wage
//    *  and generate yearly salary
//        assume that he works 2080 hour for a year.
//    * */


        Scanner scan = new Scanner(System.in);
        System.out.println(" How much do you earn an hour?");
        double hourlyWage = scan.nextDouble();
        double yearly = hourlyWage*2080;
        System.out.println(" I can make "+ yearly+" dollar salary in a year");
    }
}
