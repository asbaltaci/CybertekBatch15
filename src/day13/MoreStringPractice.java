package day13;

import java.util.SplittableRandom;

public class MoreStringPractice {
    public static void main(String[] args) {


        String name = "Pumpkin" ;
        System.out.println(name);

        name.toUpperCase();// since we didint assign it didnt work
        System.out.println( name);

        System.out.println(name.toUpperCase()); // it works czo its inside and assigned

        name = name.toUpperCase(); // we gave a new value. so it detects the last one and it changed again/
        System.out.println(name);
    }
}
