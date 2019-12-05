package day2;

public class VariablePractice2 {
    public static void main(String[] args) {

        System.out.println("My course started ");
        int my$FolderCount = 6;
        my$FolderCount = 10; //if the variable declared/assigned again without printing, it will detect the last one.
        System.out.println(my$FolderCount);
        my$FolderCount = 20; // if it is declared again after print, it gets both
        System.out.println(my$FolderCount);

      }
}
