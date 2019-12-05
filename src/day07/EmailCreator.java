package day07;

import java.util.Scanner;

public class EmailCreator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your name, company and email");

        String firstname = "ahmet";
        String lastname = "baltaci";
        String comopany = "Verizon";
        String email = firstname+lastname+ "@gmail.com";

        firstname = scan.next();
        lastname = scan.next();
        comopany = scan.next();

        System.out.println(" My name is "+ firstname+ " "
                + lastname+" and I work for "+comopany+" and my email is "+email);


    }
}
