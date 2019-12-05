package day05;

import java.util.Scanner;

public class GroceryActions {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price for potato?");
        float potatoPrice = scan.nextFloat();
        System.out.println("How many you want to buy?");
        int potatoCount = scan.nextInt();

        System.out.println("your total for potato "+ (potatoPrice*potatoCount));

    }
}
