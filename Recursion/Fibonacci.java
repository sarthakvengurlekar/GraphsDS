package Recursion;

public class Fibonacci {

    public int head(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fib1 = head(n - 1);
        int fib2 = head(n - 2);

        return fib1 + fib2;
    }

    public int tail(int n, int a, int b){
        if(n == 0){
            return a;
        }
        if(n == 1){
            return b;
        }

        return tail(n - 1, b, a + b);
    }
    // n = 5, a = 0, b = 1
    // (4, 1, 1)
    // (3, 1, 2)
    // (2, 2, 3)
    // (1, 3, 5)

}
