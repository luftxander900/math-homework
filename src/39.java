import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter operation: (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        
        System.out.println("Enter number2: ");
        double num2 = scanner.nextDouble();
        
        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 + " / " + num2 + " = " + (double)(num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
        }
    }
}
