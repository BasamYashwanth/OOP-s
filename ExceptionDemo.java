package java;

public class ExceptionDemo {

    public static void main(String[] args) {
        int a = 30, b = 0;
        try {
            int c = a / b; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero");
        }
    }
}