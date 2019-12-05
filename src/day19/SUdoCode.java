package day19;

import java.util.Scanner;

public class SUdoCode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your speed");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start<end) {
            System.out.println("Increasing the speed");
            for (int i = start; i<=end; i++){
                System.out.print(i+", ");
        }
        }else if (start>end){
            System.out.println("Decreasing the speed");
            for (int i = start; i>=end; i--){
                System.out.print(i+", ");
            }
        }else {
            System.out.println("No action needed!!!");
        }

    }
}
