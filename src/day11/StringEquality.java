package day11;

public class StringEquality {
    public static void main(String[] args) {
/*
        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("is c1 equal to c2 ?");
        System.out.println(c1 == c2);

        System.out.println("is c1 equal to c3 ?");
        System.out.println(c1 == c3);
*/

        String name = "Ahmet" ; //String literal
        String name2 = new String("Ahmet") ;
        String name3 = "Ahmet" ;

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);


        System.out.println( name == name2    );
        System.out.println( name == name3    );

        System.out.println("USING EQUALS METHODS");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}
