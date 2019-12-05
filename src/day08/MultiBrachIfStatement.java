package day08;

public class MultiBrachIfStatement {
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


        int currentSpeed = 65 ;

        if ( currentSpeed>70  ) {
            System.out.println(" You are speeding more than 70 ---POINTS TAKEN!!!");
        // else if means asking another question
        }else if (currentSpeed > 60) {
            System.out.println(" Your speed is less than or equal 70 but more than 60");
        }else {
            System.out.println("Keep Driving!!");



        }



    }
}
