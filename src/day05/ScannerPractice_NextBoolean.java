package day05;


import java.util.Scanner;

public class ScannerPractice_NextBoolean {
    public static void main(String[] args) {

// Creating a scanner object

        Scanner input = new Scanner(System.in);

        // saking user are you recording?
        System.out.println("Are you recording?");
        boolean isrecording = input.nextBoolean();

        //
        System.out.println("We are recording "+ isrecording);


    }
}
