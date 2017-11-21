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

        Person person1 = new Person(30, "Denys");
        Person person2 = new Person(30, "Vova");
        Person person3 = new Person(30, "Denys");

        try {
            int a = 5/0;
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.hashCode());
    }

}