package day11;

public class ScoreChecker {
    public static void main(String[] args) {
        // create a prog to check the score:
        //

        int score = 90;
        // if the score is less than 0 or more than 100-->> Invalid

        if (score < 0 || score > 100) {
            System.out.println(" Invalid score");
        } else if (score <20) {
            System.out.println("Come to my office");
        } else if (score >=30 && score<40) {
            System.out.println("Attend tutorials");
        } else if (score >=40 && score<70) {
            System.out.println("Study a bit more");
        } else if (score == 100) {
            System.out.println("Perfect score!!");
        } else if (score >=70 && score<=1000) {
            System.out.println("You passed!!");
        } else {
            System.out.println("You have failed");


        }
    }
}