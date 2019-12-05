package day11;

import org.w3c.dom.ls.LSOutput;

public class Exclamation_mark {
    public static void main(String[] args) {
        // logical NOT operator. it can not be used for any other data type other than boolean.
        System.out.println( true );
        System.out.println( false );
        System.out.println( !true );
        System.out.println( !false );

        //negate the result. it reverse the result.
        boolean isRecording = false ;
        System.out.println( ! isRecording );

        // you can use it in front of a boolean expression.
        // i.e: 6>5 , x<100 , y++20 ....

        System.out.println(! (7>5));

        int x = 7 ;
        System.out.println( x>10 );

        System.out.println( ! (x>10) );




    }


}
