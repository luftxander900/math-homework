public class MathHomework {
    public static void main(String[] args) {
        // Example 1: Simple addition of two numbers
        int num1 = 5;
        int num2 = 3;
        System.out.println("The sum is: " + (num1 + num2));

        // Example 2: Using a loop to multiply two numbers
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Example 3: Displaying the current temperature in Celsius and Fahrenheit
        int tempCelsius = 10;
        float tempFahrenheit = (tempCelsius * 9 / 5) + 32;
        System.out.println("Temperature in Celsius: " + tempCelsius);
        System.out.println("Temperature in Fahrenheit: " + tempFahrenheit);

        // Example 4: Calculating the square root of a number
        double num = 16;
        System.out.println("The square root is: " + Math.sqrt(num));
    }
}
