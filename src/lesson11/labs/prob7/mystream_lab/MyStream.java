package lesson11.labs.prob7.mystream_lab;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream<T> {
	private List<T> elements;
	public static <T> MyStream<T> of(List<T> aList) {
		//implement
		MyStream<T> myStream = new MyStream<>(aList);

		return myStream;
	}
	private MyStream(List<T> aList) {
		//implement
		elements = aList;
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		//implement
		MyStream<S> myStream = new MyStream<>(s1.elements);
		myStream.elements.addAll(s2.elements);
		return myStream;
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		//implement


        List<R> lst = new LinkedList<>();

        for(T t:elements){
            lst.addAll(mapper.apply(t).elements);
        }

        MyStream<R> myStream = new MyStream<>(lst);
		return myStream;
	}
	
	public List<T> asList() {
		//implement
		return elements;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		//implement
        List<R> lst = new LinkedList<>();

        for(T t:elements){
            lst.add(mapper.apply(t));
        }

        MyStream<R> myStream = new MyStream<>(lst);
        return myStream;
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		//implement
        List<T> lst = new LinkedList<>();

        for(T t:elements){
            if(predicate.test(t)) {
                lst.add(t);
            }
        }

        MyStream<T> myStream = new MyStream<>(lst);
        return myStream;
	}
}
