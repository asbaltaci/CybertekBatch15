package practises;

import java.util.Scanner;

public class ReplPractice42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(number%2==0) {
            System.out.println(number+" is even");
        }else if(! (number%2==0 )) {
            System.out.println(number+" is odd");
        }else {
            System.out.println();
        }
    }
}
