import java.io.File;
import java.util.Scanner;


public class WordCounter {

    public static void main(String[] args) throws Exception {
        File file = new File("A_Tale_Of_Two_Cities.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()== true) {
            String line = scanner.nextLine();
            words += line.split( " ").length;
        }
        System.out.println("The file contains " + words);
    }
}

