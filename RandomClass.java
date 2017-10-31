import java.util.Random;

public class RandomClass{
  public static void main (String[]  args) {
    Random random = new Random();
        int randomInt = random.nextInt(1001);
        System.out.println("A random number between 0 and 1000 is: " +  randomInt);
  }
}
