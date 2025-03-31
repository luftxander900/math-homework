import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        int result = (int)Math.ceil((num1 + num2) / 2.0);
        System.out.println("The ceiling of the sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
