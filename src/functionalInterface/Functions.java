package functionalInterface;

import java.util.function.Function;

public class Functions{

	public static void main(String[] args) {
		Function<Integer, Integer> f= i->i*i;
		System.out.println(f.apply(10));
		System.out.println(f.apply(12));

		
		Function<Integer, Integer> f1= i->i*i;
		Function<Integer, Integer> f2= i->i*i*i;
		
		System.out.println(f1.andThen(f2).apply(3));
		//first f1 executed then f2
		System.out.println(f1.compose(f2).apply(3));
		//first f2 executed then f1
	}

}
