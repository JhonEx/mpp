package lesson9.labs.prob4.partB;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class PrimeStream{
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    private final Supplier<Stream<Integer>> primeStreamSupplier = () -> Stream.iterate(1, n -> {
        int tmp = n + 1;

        while(!isPrime(tmp)){
            tmp += 1;
        }

        return tmp;
    });


    void printFirstNPrimes(long n) {
        this.primeStreamSupplier.get()
                .limit(n).forEach(prime -> System.out.print(prime+"    "));
        System.out.println();
    }

    private static boolean isPrime(int n) {
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
