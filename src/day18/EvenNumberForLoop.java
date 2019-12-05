package day18;

public class EvenNumberForLoop {
    public static void main(String[] args) {
        // skip counting by 2 starting from 0

        for (int i=0; i<100 ; i=i+3  ){ //i+=2
            System.out.println("i: "+i);

        }

        System.out.println("---------------------");
        for (int i = 0; i < 100; i++) {
            if (i % 5 ==0 && i % 3 ==0){
                System.out.println(i+ " is FizzBuzz NUmber");
            }
        }
        System.out.println();
        System.out.println("----------even number ");

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
    }
}}}
