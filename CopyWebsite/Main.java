import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a URL to copy: ");
	    String URLString = new Scanner(System.in).nextLine();
	    try {
	        java.net.URL urlData = new java.net.URL(URLString);
            java.io.PrintWriter output = new java.io.PrintWriter("websiteData.html");
            output.println(URLString);
            output.println("-------------------");

            Scanner input = new Scanner(urlData.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                output.println(line);
            }
	    }
	    catch (IOException ex) {
            System.out.println("File does not exist.");
        }
    }
}

