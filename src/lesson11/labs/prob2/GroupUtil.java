package lesson11.labs.prob2;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.MULTIANEWARRAY;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {
		List<?> elements = group.getElements();
//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
//		return grp;
		return copyHelper(group);
	}
	
	private static <T> Group<T> copyHelper(Group<T> srcGroup){
		return new Group<T>(srcGroup.getSpecialElement(), srcGroup.getElements());
	}
	
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
		
		
		List<? extends Object> t1 = new ArrayList<>();
		
		List<Object> list2 = new ArrayList<>();
		
		List<? super Integer> list3 = new ArrayList<>();
		
		List<? extends Number> list4 = new ArrayList<>();
		
		List<Number> list5 = new ArrayList<>();
		
		List<? extends Integer> list6 = new ArrayList<>();
		
		List<Integer> list7 = new ArrayList<>();
		
		List<Number> list8 = new ArrayList<>();
		
		t1 = list4;
//		list6 = list8;
		list6 = list7;
		
		list3 = list7;
//		list3 = list6;
		list4 = list6;
		list3 = list5;
		
		list4 = list5;
//		list4 = list3;
//		list3 = t1;
		t1 = list3;
		t1 = list2;
//		list2 = t1;
	}
}
