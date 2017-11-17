import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try { 
		     System.out.println("Enter two numbers to divide: ");
		     int number1 = input.nextInt();
		     int number2 = input.nextInt();
		     System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));	 
		}
		catch(Exception e) {
			System.out.println("The numbers you entered are not divisible as integers.  Please try again.");
		}
	}

}
