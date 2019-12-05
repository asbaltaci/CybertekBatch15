package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        // smart lock door has password
        // unless you enter correct password
        // it keeps locking you out
        // assuming correct password id B15
        //keep asking until user enter correct one
        Scanner scan = new Scanner(System.in);
        System.out.println("Knock Knock!!");
        System.out.println("What's the password?");
        //entering password for the first time
        String password = scan.next();

        while (! password.equals("B15")) {
            System.out.println("Wrong password!! Try Again!!");
            password = scan.next();

        }

        System.out.println("Open Sesame!!");

    }
}
