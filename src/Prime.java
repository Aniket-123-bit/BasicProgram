import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static void main(String[] args) {
        List<Long> primes = new ArrayList<>();
        long max = 10;
        long num = 0;
        while (num < max) {
            if (isPrime(primes, num)) {
                primes.add(num);
            }
            num++;
        }
        System.out.println("count: " + primes.size());
        System.out.println("primes: " + primes);
    }

    public static boolean isPrime(List<Long> primes, long number) {

        if (number < 2) return false;

        for (Long prime : primes) {
            if (number % prime == 0) return false;
        }

        return true;
    }
}