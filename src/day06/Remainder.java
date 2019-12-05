package day06;

import java.sql.SQLOutput;

public class Remainder {
    public static void main(String[] args) {

        // + - / *

        System.out.println( 5/2);

        System.out.println( 5.0/2);

        System.out.println( 5.0/2f);

        // 5 / 2 = 2 and remainder is 1

        // 2*2 +1 = 5
        System.out.println( 5 % 2);

        //
        System.out.println( 99 % 10);


        int minutes = 60;

        System.out.println((135/60)+" hours "+(135%60)+" minutes ");

    }
}
