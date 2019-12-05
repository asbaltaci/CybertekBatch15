package day08;

public class IfElseComplex2 {

    public static void main(String[] args) {

        int speedLimit = 60 ;

        int yourCurrentSpeed = 60 ;

        //if you are speeding
        // pulled over
        // get ticket
        //loose points
        //go to court

        boolean IamSpeeding = yourCurrentSpeed > speedLimit ;
        if(IamSpeeding ) {
            System.out.println(" You will be pulled over by police");
            System.out.println(" You will get ticket by police");
            System.out.println(" You will loose points");
            System.out.println(" You will go to court");
        }else {
            System.out.println(" Go shopping!!");
            System.out.println(" Go home!!");

        }

        // if not over the limit
        // go shopping
        // go home


        //outside if statement, say the end

        System.out.println("THE END");


    }


}
