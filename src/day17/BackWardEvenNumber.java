package day17;

public class BackWardEvenNumber {
    public static void main(String[] args) {
        int counter = 100;

        while (counter > 0) {


            if (counter % 2 == 0) {
                System.out.println(counter + " is even number");
            }else if (counter%2 !=0){ //==>> x%2 ==1 does same thing
                System.out.println(counter+" is odd number");
            }
            --counter;
        }
    }
}
