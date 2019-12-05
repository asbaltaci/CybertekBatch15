package day3;

public class CharacterandBoolean {
    public static void main(String[] args) {
        char grade = 'A' ;
        char emailSign = '@' ;
        System.out.println(emailSign);

        System.out.println("I am in grade "+ grade);
        System.out.println("I am " + emailSign + " the cinema now.");

        boolean isLightOn = true;
        boolean areYouSleeping = true;

        isLightOn = false; //the last variable is the current and valid one
        System.out.println("Is the light on? " + isLightOn);

        // its not variable so it doesnt affect the
        System.out.println("Are you sleeping? " + areYouSleeping);

    }
}
