import java.util.Scanner;
public class MathHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The sum of these two numbers is: " + (num1 + num2));
    }
}