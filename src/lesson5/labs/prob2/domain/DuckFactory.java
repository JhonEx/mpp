package lesson5.labs.prob2.domain;

public class DuckFactory {

	public static String MallardDuck = "MallardDuck";
	public static String RedheadDuck = "RedheadDuck";
	public static String RubberDuck = "RubberDuck";
	public static String DecoyDuck = "DecoyDuck";
	
	private DuckFactory(){}
	
	public static Duck createDuck(String type) throws Exception{
		
		if(type.equals(MallardDuck)){
			return new MallardDuck();
		}
		if(type.equals(RedheadDuck)){
			return new RedheadDuck();
		}
		if(type.equals(RubberDuck)){
			return new RubberDuck();
		}
		if(type.equals(DecoyDuck)){
			return new DecoyDuck();
		}
		throw new Exception("unsupported duck.");
	}
}
