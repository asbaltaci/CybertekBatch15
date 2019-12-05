package day11;

public class LightOnTask_IfElse {
    public static void main(String[] args) {
        System.out.println("Which room light is turned on?");
    String targetOption = "Bd";

        if (targetOption=="Bd") { System.out.println("You have turned on bedroom light"); }
                else if (targetOption=="Ki") { System.out.println("You have turned on kitchen light"); }
                else if (targetOption=="Ha") {System.out.println("You have turned on hallway light"); }
                else if (targetOption=="Lr") { System.out.println("You have turned on living room light");}
                else {System.out.println("No such light in your house.");
                }
 }
}
