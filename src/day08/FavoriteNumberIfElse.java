package day08;

import java.util.Scanner;

public class FavoriteNumberIfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Have you filled up 150 day period?");
        int answer = scan.nextInt();

        if (answer >=150 ) {
            System.out.println("Bingo! Now you can apply for Work Permit");
        }else{
            System.out.println("Sorry!!Wait until you fill up 150 days!");
        }
        }

    }

