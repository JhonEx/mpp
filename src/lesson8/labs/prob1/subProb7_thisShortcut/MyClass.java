package lesson8.labs.prob1.subProb7_thisShortcut;

import java.util.function.*;

public class MyClass {

	private String attribute;
	
	public MyClass(String attr) {
		this.attribute = attr;
	}
	
	public boolean myMethod(MyClass input){
		
		Function<MyClass, Boolean> comparator = this::equals;
		
		return comparator.apply(this);
	}
	
	public static void main(String[] args) {
		
		MyClass class1 = new MyClass("class1");
		MyClass class2 = new MyClass("class2");
		
		System.out.println(class1.myMethod(class2));
	}
	
	public String getAttribute(){
		return attribute;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribute == null) ? 0 : attribute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (attribute == null) {
			if (other.attribute != null)
				return false;
		} else if (!attribute.equals(other.attribute))
			return false;
		return true;
	}
}
