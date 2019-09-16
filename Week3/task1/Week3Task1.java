// package task1;
import java.util.*;

public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
        if(b == 0) return a;
        
        return gcd(b, a % b);
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        if(n == 0 ) return 0;
        if(n == 1) return 1;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
        boolean[] isOut = new boolean[n];
        Arrays.fill(isOut, true);
        
        for(int i = 2; i < n; i++) {
            for(int j = i;j <= n / i; j++) {
                isOut[j * i - 1] = false;
            }
        }

        for(int i = 1; i < n; i++) {
            if(isOut[i]) System.out.print(i + 1 + " ");
        }
    }

    static public void main(String[] args) {
        Week3Task1 w = new Week3Task1();

        System.out.println("gcd " + w.gcd(10, 3));
        System.out.println("fib " + w.fibonacci(9));
        w.sieveEratosthenes(10);
    }
}
