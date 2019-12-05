package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {

        //here it checks the first one and then doesn't go further
        System.out.println(5>10 && 9/0 ==3);

        //here it checks the whole operation not just the first one
        System.out.println(5>10 & 9/0 ==3); //

    }
}
