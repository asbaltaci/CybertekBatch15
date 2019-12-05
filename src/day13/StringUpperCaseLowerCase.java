package day13;


public class StringUpperCaseLowerCase {
    public static void main(String[] args) {
        //String actions we already known so far

        // equals
  /*      String s1 = "hello" ;
        System.out.println(s1.equals("abc"));
        System.out.println(! s1.equals("abc"));

        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of String makes String all uppercase
        System.out.println( s1 );
        System.out.println(  s1.toLowerCase()     );
        System.out.println(  s1.toUpperCase()    );
*/
        String myName = "ahmet" ;
        String surname = " baltaci" ;
        String fullName = myName+surname ;
        System.out.println(myName.toUpperCase());
        System.out.println("My name is "+ myName.toUpperCase()+surname.toUpperCase());
        System.out.println("My full name is "+ fullName.toUpperCase());
        System.out.println(  (fullName.toUpperCase()).toLowerCase()  );
    }
}
