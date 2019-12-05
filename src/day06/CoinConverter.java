package day06;

public class CoinConverter {

    public static void main(String[] args) {

        // you have 2 $
        //how many dimese you can get 10c
        //how many quarter you can get 25c
        // how many Nicket 5c
        //how many penny 1c

        int cent = 200 ;
        // you purchased candlle for 0.74 cent,
        // what would be your ramainder/

        cent -= 74 ;
        int quarter = cent/25;
        System.out.println(quarter);



    }
}
