package practises;

import java.util.Scanner;

public class ReplPractice23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your are code?");
        int areCode = scan.nextInt();
        System.out.println("What is your are local Code?");
        int localNumber = scan.nextInt();


        String phoneNumber = "("+areCode+")-"+localNumber;
        System.out.println("Calling number "+ phoneNumber);




    }
    }

