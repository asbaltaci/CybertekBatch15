package day05;

public class ScannerPractice2 {
    public static void main(String[] args) {

        // Task 2: you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : You are driving 10 mph more than speed limit

        int speedLimit = 60;
        int currentSpeed = 70;
        int overTheLimit = currentSpeed - speedLimit ;

        System.out.println("You are driving " +overTheLimit+ " mph more than speed limit");



    }
}
