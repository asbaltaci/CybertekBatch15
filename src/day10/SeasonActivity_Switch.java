package day10;

public class SeasonActivity_Switch {
    public static void main(String[] args) {

        String season = "Fall" ;


        switch (season) {

            case "Spring":
                System.out.println("I celebrate Easter with my family");
                break;
            case "Summer":
                System.out.println("YI go on vacation to Hawaii");
                break;
            case "Fall":
                System.out.println("Looking forward to do some shopping on Black Friday");
                break;
            case "Winter":
                System.out.println("I go on winter sleep");
                break;
            /*default:
                System.out.println("Invalid Season!!");
                break;
                no need here!!!
             */


        }
    }
}
