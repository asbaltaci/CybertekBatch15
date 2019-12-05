package day09;

import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch (name) {
            case "Ahmet":
                System.out.println(" Welcome to the real world");
                break;
            case "Mehmet":
                System.out.println("Go away");
                break;
            default:
                System.out.println("Wrong address!!!");
                break;

        }
    }
}
