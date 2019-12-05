package day09;

import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score!!");
        int score=scanner.nextInt();

        switch (score) {
            case 90 :
                System.out.println("Very Good!!");
                break;
            case 60 :
                System.out.println("Good");
                break;
            case 40:
                System.out.println("OK");
            default:
                System.out.println("You failed!!! Go Home!!");
                break;
        }
    }
}
