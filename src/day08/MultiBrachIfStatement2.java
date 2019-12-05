package day08;

public class MultiBrachIfStatement2 {
    public static void main(String[] args) {

        //pseudo code
        //give your currentSpeed , speedLimit
        //
        //check if the current speed is
        //more than 90==> jail
        //more than 80 and less than 90 ==.. reckless driving


        // more than 70 and less than 80==> point taken
        // more than 60 and less than 70==> warning
        //
        //if not speeding, keep driving


        int currentSpeed = 80 ;


        if ( currentSpeed>=90  ) {
            System.out.println(" You go to Jail!!!");
        // else if means asking another question
        }else if (currentSpeed >= 80) {
            System.out.println(" You are driving reckless. Be careful!!");
        }else if (currentSpeed >=70 ){
            System.out.println("Warning!!");
        }else if (currentSpeed >=60){
            System.out.println("Keep Driving!!");
        }else { System.out.println("Keep Driving!!");}



    }
}
