package day12;

import java.util.Scanner;

public class StringEqualitySeasonScanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println(" What season is it?");

        String season = scan.next();

        if (season.equalsIgnoreCase("spring")) {
            System.out.println("Hiking, NAvruz etc...");
        }else if (season.equalsIgnoreCase("winter")) {
            System.out.println("Skiing, travelling..");
        }else if (season.equalsIgnoreCase("summer")) {
            System.out.println("Swimming, pool, beach...");
        }else if (season.equalsIgnoreCase("fall")) {
            System.out.println(" Code code code");
        }else {
            System.out.println("Not Valid!!!");
        }

    }
}
