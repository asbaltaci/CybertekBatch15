package day09;

public class DayPrinter {
    public static void main(String[] args) {

        /*create a variable called dayCode
        if dayCode is 1===>> Monday
        if dayCode is 2===>> Tues
        if dayCode is 3===>> W
        if dayCode is 4===>> Th
        if dayCode is 5===>> Fri
        if dayCode is 6===>> sat
        if dayCode is 7===>> Sun
        if none of them above just print unknown day
         */
    int dayCode = 7 ;

    if (dayCode==1) {
        System.out.println("Day os Monday");
    }else if (dayCode==2) {
        System.out.println("day is Tuesday");
    }else if (dayCode==3) {
        System.out.println("day is Wednesday");
    }else {
        System.out.println("Day is unknown");
    }


    }
}
