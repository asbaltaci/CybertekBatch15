package day11;

public class LogicalOperatorPractice1 {
    public static void main(String[] args) {

/*
        int num = 60 ;
        System.out.println("Is the operator true or false?");
        System.out.println(num>10 && num<100);
        System.out.println(num<10 && num<100);
        System.out.println(num>10 && num>100);
        System.out.println(num>10 && num>100);

        System.out.println("Is the operator true or false?");
        System.out.println(num>10 || num<100);
        System.out.println(num<10 || num<100);
        System.out.println(num>10 || num>100);
        System.out.println(num>10 || num>100);
*/
        int x = 55;
//                          true    true
//                                true      false
        System.out.println(x>50 && x!=52 || x==57);
    }
}
