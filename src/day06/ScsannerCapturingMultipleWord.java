package day06;

import java.util.Scanner;

public class ScsannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner blaBla = new Scanner(System.in);
        System.out.println(" What is your name?");

        String name = blaBla.next();
        String anotherWord = blaBla.next();
        int thirdWord = blaBla.nextInt();



        System.out.println("Your first name is "+ name);
        System.out.println("Your middle name is "+ anotherWord);
        System.out.println("Your last name is " + thirdWord);

    }
}
