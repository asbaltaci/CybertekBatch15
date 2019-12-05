package day05;

public class ScannerPractice1 {
    public static void main(String[] args) {

        //whole numbers : byte, short, int , long
        // fractional numbers : float, double
        // logical : bolean
        // character : char (single charater)

        // usually by deafult for whole numbers use : int
        // for fractional numbers : double

        // age calculator
        // given birth year, calculaet the age

        int birthYear = 1976 ;
        int currentYear = 2019;
        int age = currentYear - birthYear ;

        // I was born in 1976, I am 43 now.

        System.out.println( currentYear - birthYear);
        System.out.println( "I was born in " +birthYear+ ", I am " + age+ " now.");
    }
}
