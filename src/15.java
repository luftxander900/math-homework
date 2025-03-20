public class MathHomework {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + subtract(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}