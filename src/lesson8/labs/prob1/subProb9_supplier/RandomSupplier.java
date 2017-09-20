package lesson8.labs.prob1.subProb9_supplier;

import java.util.function.Supplier;

public class RandomSupplier {

	public static void main(String[] args) {
		Supplier<Double> supplier = Math::random;
		
		System.out.println(supplier.get());
	}
}
