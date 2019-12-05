package day3;

public class Primitives {
    public static void main(String[] args) {

        byte letterCount = 26 ;
        System.out.println("The letter count is " + letterCount) ;

        short sheepCount = 300 ;
        System.out.println( "The number of the sheep in my cattle is " + sheepCount);

        int catCount = 20 ;
        System.out.println("The cats in the Cat Hotel was " + catCount + " when I last visited");

        long mileToSun = 10000000L ;
        // L is optional
        System.out.println("What was the distance between the world to sun? " + mileToSun);

        // Floating point
        // its mandatory to write f/F

        float priceOfBanana = 1.99f ;
        System.out.println("I can not believe the price of banana. It was " + priceOfBanana);
        float priceOfPotato = 2.49f ;
        System.out.println("I don't have enough money to buy potato. It is " + priceOfPotato + " and I only have " + priceOfBanana);

        // larger floating point numbers

        double priceOfIpad1 = 355.99d ;
        System.out.println("The price of the Ipad is " + priceOfIpad1);
        double priceOfIpadPro = 1024.99D ;
        System.out.println("The price of the Ipad Pro is "+ priceOfIpadPro);

        // compiler autom. assume its a double so its not required to have d but for a good programming its suggested

        double priceOfMac = 2299.99D ;
        System.out.println(priceOfMac + " is incredibly high price of Mac.");

        // If you have a whole number by itself, compiler autom. assume it's an int
        // if you a fractional number by itself.\, compliler autom. assume its a double.


    }
}
