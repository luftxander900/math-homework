import java.util.Scanner;

public class MathHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else if (num1 < 0 || num2 < 0) {
            System.out.println("At least one number is negative.");
        } else {
            System.out.println("At least one of the numbers is zero.");
        }
    }
}
