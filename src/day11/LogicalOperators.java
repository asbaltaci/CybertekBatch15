package day11;

public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Truth TableLogical AND Operator");
        System.out.println( "Result of true && true is "+(true && true) );
        System.out.println( "Result of false && true is "+(false && true) );
        System.out.println( "Result of true && false is "+(true && false ) );
        System.out.println( "Result of false && false  is "+(false && false) );

        System.out.println("Logical OR Operator");
        System.out.println( "Result of true || true is "+(true || true) );
        System.out.println( "Result of false || true is "+(false || true) );
        System.out.println( "Result of true || false is "+(true || false ) );
        System.out.println( "Result of false || false  is "+(false || false) );

        int x = 55;
//                          true    true
//                                true      false
        System.out.println((x>50 && x!=52) || x==57);
    }
}
