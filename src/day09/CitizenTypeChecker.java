package day09;


public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType ;
        int age = 90 ;

        if (age > 65 ) { citizenType = "senior" ;}
        else { citizenType = "Not Senior" ; }
        System.out.println("The citizen is "+ age+" , and he is a "+ citizenType);


    }
}
