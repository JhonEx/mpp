package lesson8.labs.prob1.subProb9_supplier;

import java.util.function.Supplier;

public class RandomSupplierWithInnerClass {

	class InnerSupplier implements Supplier<Double>{

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
	
	public void printRandom(){
		InnerSupplier innerSupplier = new InnerSupplier();
		System.out.println(innerSupplier.get());
	}
	
	public static void main(String[] args) {
		RandomSupplierWithInnerClass randomSupplierWithInnerClass = new RandomSupplierWithInnerClass();
		randomSupplierWithInnerClass.printRandom();
	}
}
