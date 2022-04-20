public class Fibonacci {
    public static void main (String args[]){
        int fib1 = 0;
        int fib2 = 1;
        int fibnoacci = fib1 + fib2;
        int num;
        System.out.println(fibnoacci);
        for (int i = 0; i <= 10; i++) {
            num = fib1 + fib2;
            System.out.println(num);
            fib1 = fib2;
            fib2 = num;
        }
    }
}