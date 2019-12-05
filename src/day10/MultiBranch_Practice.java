package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {

        String order = "" ;
        int itemNumber = 35 ;

        if (itemNumber==1) {
            System.out.println("You have selected 1");
            order = "Bureger:";
        }else if (itemNumber==5){
            System.out.println("You have selected 5");
            order = "FrenchFries:" ;
        }else if (itemNumber==8){
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else if (itemNumber==35){
            System.out.println("You have selected 35");
            order= "Icecream";
;        }else{
            System.out.println("You have selected Unknown Item");
            order="Invalid Order";

        }
        System.out.println("Your order is "+ order);
    }
}
