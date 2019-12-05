package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        //checking for string equality should be always done by
        //using equals methods of the stirng


        //comparing two Strings literal directly using equals method
        /*  System.out.println("Java".equals("java"));

        String myStr = "Java " ; // even a simple space is so sensitive
        System.out.println( myStr.equals("Java"));

        String yourStr = new String("Java") ;
        System.out.println(  "is my string same as your string?");
        System.out.println( myStr.equals(yourStr));
        */

        String myStr = "Java" ;
        if (myStr.equals("Java" )) {
            System.out.println(" Correct Word!!");
        } else {
            System.out.println("SAY JAVA");
        }


    }
}
