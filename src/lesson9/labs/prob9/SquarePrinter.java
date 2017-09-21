package lesson9.labs.prob9;

import java.util.stream.IntStream;

public class SquarePrinter{
    public static void printSquares(int num){
       IntStream intStream = IntStream.iterate(1,n -> {
            return (int)Math.pow(Math.sqrt(n)+1,2);
        } ).limit(num);

        intStream.forEach(System.out :: println);
    }

    public static void main(String[] args) {
        printSquares(5);
    }
}
