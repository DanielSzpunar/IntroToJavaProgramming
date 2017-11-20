import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
public class main {
  public static void main (String[]  args) throws IOException {
    java.io.File file = new java.io.File("test.txt");
    java.io.PrintWriter output = new java.io.PrintWriter(file);
    output.println("this is not a test.");
    output.close();
    Scanner input = new Scanner(System.in);
    System.out.println("How large of an array would you like to print?");
    int arraySize = Integer.parseInt(input.nextLine());
    int[] array = new int[arraySize];
    System.out.println("enter integers to add to your array: ");

    for (int i = 0; i < array.length; i++) {
      int num = Integer.parseInt(input.nextLine());
      array[i] = num;
    }
    System.out.println(Arrays.toString(array));
    int smallestValue = array[0];
    for(int i = 0; i < array.length; i++) {
      if (smallestValue < array[i]) {
        smallestValue = array[i];
      }
    }
    System.out.println("The largest integer in your list is: " + smallestValue);
  }
}
