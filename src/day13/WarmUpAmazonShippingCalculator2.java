package day13;

public class WarmUpAmazonShippingCalculator2 {
    public static void main(String[] args) {

        // create a boolean to store the result of YouWantToShop
        // if yes, wanna go shopping online or to a store?
        // if the user don't wanna shop, print Good DAy stay home!!

        boolean YouWantToShop = true ;
        String preference  = "Online" ;

        if ( YouWantToShop == true ){

            if (preference.equals("Store")) {
                System.out.println("Go to store for shopping");
            }else {
                System.out.println("Go  online shopping");
            }
        } else {
            System.out.println("Good Job! Stay home coding!!");
        }
    }
}
