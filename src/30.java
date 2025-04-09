public class MathHomework {
    public static void main(String[] args) {
        // Code to perform calculations and display results
        System.out.println("Please enter your algebra homework problems: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            double num1, num2;
            System.out.print("Enter problem " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                if (num1 != 0 && num2 != 0) {
                    double result = calculate(num1, num2);
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Please enter valid numbers.");
                }
            } else {
                System.out.println("Please enter a number between 0 and 9.");
            }
        }
    }

    private static double calculate(double num1, double num2) {
        // Perform calculations here
        return (num1 + num2) / 2;
    }
}
