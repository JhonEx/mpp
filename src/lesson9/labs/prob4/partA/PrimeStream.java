package lesson9.labs.prob4.partA;

import java.util.stream.Stream;

public class PrimeStream{

    public static void main(String[] args) {
        primes.limit(20).forEach(prime -> System.out.print(prime+"\t"));
    }

  public final static Stream<Integer> primes = Stream.iterate(1, n -> {
        int tmp = n + 1;

        while(!isPrime(tmp)){
            tmp += 1;
        }

        return tmp;
    });

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
