package day07;

public class ShorthandPRactice {
    public static void main(String[] args) {

        int score = 10 ;
        //score = score + 4;

        score +=4; //14
        score *=3; //42
        score /=2; //21
        score %=5; // remainder 1 // 5*4+1=21

        //System.out.println(score);

        int minutes = 315;
        int hours = minutes/60;
        minutes%=60; //minutes = minutes%60;
        System.out.println(hours+","+minutes);





    }




}
