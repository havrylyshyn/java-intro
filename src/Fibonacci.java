public class Fibonacci {
    public static void printFibonacciNumbers(int n) {
        int[] fib = new int[n];
        System.out.println("First " + n + " Fibonacci numbers by loop:");
        System.out.print((fib[0] = 0) + " ");
        System.out.print((fib[1] = 1) + " ");
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(fib[i] + " ");
        }
    }

    static int n1 = 0, n2 =1, n3 = 0;
    public static void printFibonacciNumbers2(int n) {
        if (n == 0) {
            return;
        }
        else {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            printFibonacciNumbers2(--n);
        }
    }
}
