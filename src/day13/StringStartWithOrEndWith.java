package day13;

import java.util.Scanner;

public class StringStartWithOrEndWith {
    public static void main(String[] args) {

        String name = "Muge" ;
        System.out.println(name.startsWith("Mu"));// it gives true
        System.out.println(name.startsWith("mu")); //it is case sensitive so it gives false

        System.out.println(name.endsWith("ge"));


    }
}
