package day04;

public class TemperatureCalculator2 {

    public static void main(String[] args) {

        double fahrenheit ;
        double celcius = 45;

        fahrenheit = (celcius * 9/5) + celcius;
        System.out.println(" The temperature outside is "+ fahrenheit+ "F");


        double literperkm = 10;
        double milespergallon;
        milespergallon = 2.35215/(literperkm/100);
        System.out.println(" 7 liter per 100 km is equal to "+ milespergallon+"mpg");


    }
}
