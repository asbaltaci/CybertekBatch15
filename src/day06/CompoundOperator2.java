package day06;

public class CompoundOperator2 {

    public static void main(String[] args) {

        int bankBalance = 1140 ;
        System.out.println(" I have spent the half of it :"+bankBalance);
        bankBalance = bankBalance /2;

        System.out.println(" Now my balance is  :"+ bankBalance);

        bankBalance %=500;

        System.out.println(" Now my balance is  :"+ bankBalance);
    }
}
