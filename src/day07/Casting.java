package day07;

public class Casting {
    public static void main(String[] args) {

        //int num = 10 ;
        //
        double bigNum = 10 ;

        System.out.println( bigNum);

        // 12.99 is double and doesn't fit int
        //int num = 12.99 ;

        int num = (int) 12.99;
        System.out.println(num);

        num = (int) bigNum;

        System.out.println(num);

        long earthToMoon = 10000 ;
        int earthTomMon_Int = (int) earthToMoon;

        System.out.println( earthTomMon_Int);
    }
}
