package day10;

public class Calculator1 {
    public static void main(String[] args) {

        char operator = '+';

        switch (operator) {

            case '+':
                System.out.println("You are about to add number");
                break;
            case '-':
                System.out.println("You are about to subtract  number");
                break;
            case '*':
                System.out.println("You are about to multiply  number");
                break;
            case '/':
                System.out.println("You are about to divide  number");
                break;
            default:
                System.out.println("YOU HAVE SELECTED Unknown ITEM NUMBER@!!");
                break;


        }
    }
}
