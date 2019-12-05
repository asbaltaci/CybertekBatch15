package day13;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        String name = "ahmet" ;
        String city = "Manchester" ;
        System.out.println(  (name+city).length()   );
        System.out.println( name.toUpperCase()+" lives in "+city.toUpperCase()  );

        int lengthOfStr = name.length();

        if (lengthOfStr>4 ) {
            System.out.println(" More than 4 character");

        }else {
            System.out.println(" Not more than 4");
        }


    }
}
