package day18;

public class Tutorial1 {
    public static void main(String[] args) {
        String letter = "J%a^V****$a";
        System.out.println("letter = " + letter);

        letter = letter.replace("%", "")
                .replace("^", "")
                .replace("*", "")
                .replace("$", "")
                .toUpperCase();
        System.out.println("letter = " + letter);




    }
}
