package day11;

public class LightOnTask_Switch {
    public static void main(String[] args) {

        String targetOption = "Ki";
        System.out.println("Which room light is turned on?");
        switch (targetOption) {
            case "Bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Ha":
                System.out.println("You have turned on hallway light");
                break;
            case "Lr":
                System.out.println("You have turned on living room light");
                break;
            default:
                System.out.println("No such light in your house.");
        }
    }
}
