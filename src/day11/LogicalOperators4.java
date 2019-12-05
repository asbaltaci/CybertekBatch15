package day11;

public class LogicalOperators4 {
    public static void main(String[] args) {


        // && 2 ampersand  & 1 ampersand   -->> Logical AND operator
        // This is used to check both conditions are true at the same time

        // && is called short circuit AND
        // -->> it does not check the next condition as long as the first condition is false
        // -->> just like if you have multiple condition for rocket launching
        //   isEngineRunning  , isCommunicationSystemWorking , isAirEnough

        // isEngineRunning  && isCommunicationSystemWorking &&  isAirEnough
        // if isEngineRunning is false then it does not go and check next conditions

        // &  -->> CHECK EACH AND every condition no matter what

        // isEngineRunning  & isCommunicationSystemWorking &  isAirEnough
        // if isEngineRunning is false
        // it still check isCommunicationSystemWorking
        // it still check isAirEnough
        // and eventually give you the outcome

//        System.out.println( 7>5  &&  1>7 );
//        System.out.println( 5>5  &&  1>7 );
//        System.out.println( 1>5  &&  9>7 );
//
//        System.out.println( 7>5  &  1>7 );
//        System.out.println( 5>5  &  1>7 );
//        System.out.println( 1>5  &  9>7 );


        //System.out.println(  9/0 ); // ERROR!! CAN NOT DIVIDE BY 0
        // I want to check whether dividing 9 by 0 is 3
//        System.out.println(  9/0 ==3    );

        // combine the result of
        // checking 5 is more than 10
        // and  9 divided by 0 is 3
        //System.out.println(5 > 10 && 9 / 0 == 3);
        //System.out.println(5 > 10 & 9 / 0 == 3);

        //  ||  is short-circuit as long as it finds one true it will stop looking
        //  | on the other hand will keep checking the rest of the condition
        // for example :
        // you have 5 stores you can buy milk from
        // you check the store one by one
        // do you have milk in store 1 : if yes get it and stop checking the rest of the store
        // that's exactly what double(2) pipe || do , it stop as long as it sees one
        // | single pipe will check each and every store even you already got your milk

        // combine the result of
        // checking 10 is more than 5
        // or  9 divided by 0 is 3
        System.out.println(10 > 5 || 9 / 0 == 3);
        System.out.println(10 > 5 | 9 / 0 == 3);


    }
}
