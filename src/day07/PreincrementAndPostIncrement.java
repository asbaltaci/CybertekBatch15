package day07;

public class PreincrementAndPostIncrement {
    public static void main(String[] args) {

        int apple = 8 ;
        apple++ ;


        System.out.println(apple);

        //System.out.println(++apple);

        System.out.println(apple++);
        System.out.println(apple);


        int score = 50;

        System.out.println(++score); //51
        System.out.println(score++); //51 is ready to be 52 next time
        System.out.println(score); // 52
        System.out.println(--score); // 51
        System.out.println(score--); // 51 but ready to be 50 next time
        System.out.println( score ); //50


    }
}
