package day12;

public class InterviewQuestion_AKBAR {
    public static void main(String[] args) {
        int num = 5 ;

        if (num % 5 == 0 && num % 3 == 0){
            System.out.println("This is FizzFuzz Number");
        }
        else if (num%3==0) {
            System.out.println("This is Fuzz Number ");
        }else if (num%5==0) {
            System.out.println("This is Fizz Number");
        }else {
            System.out.println("Not my number!!");
        }


    }
}
