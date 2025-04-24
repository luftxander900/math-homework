import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;
        double quotient = num1 / num2;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The difference is: " + difference);
        System.out.println("The quotient is: " + quotient);
    }
}
