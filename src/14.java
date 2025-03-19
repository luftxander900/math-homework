import java.util.Random;

public class MathHomework {
  public static void main(String[] args) {
    Random rand = new Random();
    int x = rand.nextInt(10);
    int y = rand.nextInt(10);
    System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
  }
}
