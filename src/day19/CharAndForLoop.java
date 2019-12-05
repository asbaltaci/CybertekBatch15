package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        // each char has its corresponding ASCII value from the Ascii table

        int x = 'A';
        char myChar = 'A'; //'100';
        System.out.println(x);
        System.out.println(++x);
        System.out.println(++x);
        System.out.println(++x);


        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");

        }
        System.out.println();
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
    }
}

