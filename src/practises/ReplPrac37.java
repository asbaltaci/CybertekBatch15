package practises;


import java.util.Scanner;

public class ReplPrac37 {
    public static void main(String[] args) {
        System.out.println("Enter number of coupons:");
        Scanner scan = new Scanner(System.in);
        int numberCoupons = scan.nextInt();
        int candy = numberCoupons-10 ;
        int gumball = numberCoupons-3 ;


        if (numberCoupons/candy==3 && numberCoupons/gumball==0){
            System.out.println("Number of Candies: "+candy);
            System.out.println("Number of Gumballs: "+gumball);
        }else {
            System.out.println("Not enough coupons");
        }

    }
}
