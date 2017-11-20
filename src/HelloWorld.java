public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Strings checkStringsMethods = new Strings();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciNumbers(10);

        System.out.println("\nFirst 10 Fibonacci numbers by recursion:");
        System.out.print("0 ");
        System.out.print("1 ");
        fibonacci.printFibonacciNumbers2(8);
    }

}