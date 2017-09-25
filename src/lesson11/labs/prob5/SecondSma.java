package lesson11.labs.prob5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import lesson4.labs.prob3C.main;

public class SecondSma {
	
	
	public static void main(String[] args) {
		
		List<Integer> integers=Arrays.asList(1,2,3);
		List<String> strings=Arrays.asList("aa","bb","cc");
		
	    System.out.println(secondSmallest(integers));
	    System.out.println(secondSmallest(strings));
	    
		
	}
	
	
	
	
	
	public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
		
			if( list.get(i).compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = list.get(i);
			}
			else if( list.get(i).compareTo(secondSmallest)<0) {
				secondSmallest = list.get(i);
			}
			
		}
		return secondSmallest;
	}
	

}
