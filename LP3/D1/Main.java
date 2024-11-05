
public class Main {

    // Iterative approach to calculate Fibonacci
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Recursive approach to calculate Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        // Call iterative method
        System.out.println("Iterative: Fibonacci number at position " + n + " is: " + fibonacciIterative(n));

        // Call recursive method
        System.out.println("Recursive: Fibonacci number at position " + n + " is: " + fibonacciRecursive(n));
    }
}
