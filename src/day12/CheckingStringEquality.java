package day12;

public class CheckingStringEquality {
    public static void main(String[] args) {
/*
        String userName = "aBc123" ;
        boolean userNameCorrect = userName.equals("ABC123");
        System.out.println(  userNameCorrect );
        boolean  nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");
        System.out.println(  nameCheckIgnoreCase );
*/

    String name = "Ahmet";
    boolean nameCorrect = name.equals("Ahmet");
        System.out.println(nameCorrect);
        boolean nameCheckIgnoreCase = name.equalsIgnoreCase("AhmEt");
        System.out.println(nameCheckIgnoreCase);


    }
}
