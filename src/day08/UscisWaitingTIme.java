package day08;

import java.util.Scanner;

public class UscisWaitingTIme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess my favorite number :!!");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber == 300) {
            System.out.println("Bingo!!!");
        }else{
            System.out.println(" You are not my best friend!!");
        }
        }

    }

