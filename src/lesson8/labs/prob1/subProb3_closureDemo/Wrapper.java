package lesson8.labs.prob1.subProb3_closureDemo;

public class Wrapper {

	public int performAdd(){
		
		class Closure implements Add{
			@Override
			public int add(int x, int y){
				return x + y;
			}
		}
		return new Closure().add(1, 2);
	}
}
