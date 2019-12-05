package day19;

public class HomeWorkForLoop {
    public static void main(String[] args) {

        //HOMEWORK
        //Create an interactive program to ask user starting character and ending character
        //then print everything in between
        //it could be starting character is after ending character
        // for example user can enter Z A , OR A K
        // Ask user for String and pick character by charAt()
        String line = "";
        for (char iChar = 'a'; iChar<='z'; iChar++){
        line +=iChar;
            System.out.println(line);
        }

    }
}
