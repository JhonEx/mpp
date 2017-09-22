package lesson9.labs.prob7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		System.out.println(/* implement */
		list.stream().sorted(
		        Comparator.comparing(it -> Math.abs((int)it)).thenComparing((c1,c2)->{
		            if((int)c1 < 0){
		                return -1;
                    }else if((int)c2 < 0){
                        return 1;
                    }else{
                        return 0;
                    }
                })
        ).collect(Collectors.toList())
//		list.stream().sorted((i,j) -> {
//			int tmpI = i<0? -i:i;
//			int tmpJ = j<0? -j:j;
//
//			int diff = tmpI - tmpJ;
//			if(diff == 0){
//				if(i<0){
//				    return -1;
//                }else if(j<0){
//                    return 1;
//                }else {
//                    return 0;
//                }
//			}else{
//				return diff;
//			}
//		}).collect(Collectors.toList())
        );
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		System.out.println(/* implement */
		words.stream().sorted(
		        Comparator.comparing(s -> {
		            StringBuilder sb = new StringBuilder();

                    for(int i=s.length()-1; i>=0; i--){
                        sb.append(s.charAt(i));
                    }

                    return sb.toString();
                })
        ).collect(Collectors.toList())
		);
				
	}

}
