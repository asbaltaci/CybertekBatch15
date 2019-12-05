package day06;

import java.util.Scanner;

public class ScsannerCapturingMultipleWord2 {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println(" What is your name?");
        String name = blabla.nextLine();

        System.out.println(" What is your age?");
        int age = blabla.nextInt();
        blabla.nextLine();


        System.out.println(" What is your address?");
        String streetaddress = blabla.nextLine();


        System.out.println(" You have entered "+ name + " as your name, " +age+" as the city you live and " +streetaddress+" as your address");


    }
}
