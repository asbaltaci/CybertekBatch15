package day16;

import java.util.Scanner;

public class GiveMe5 {
    public static void main(String[] args) {
        //I want to ask user to enter a number
        // I will eep asking until user enter num 5

        Scanner scan = new Scanner(System.in);

        //System.out.println("Give me FIVE");
/*        int userNumber = scan.nextInt();

        if (userNumber!=5) {
            System.out.println("hey you did not give me 5");
        }*/
        int userNumber = 0 ;
        while (userNumber !=5){
            System.out.println("Give me 5");
            userNumber = scan.nextInt();
        }
        System.out.println("Bravo!! You found it!!");
    }
}
