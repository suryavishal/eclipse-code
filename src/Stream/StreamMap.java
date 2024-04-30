package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
	public static void main(String[] args) {

		List<String> lis = Arrays.asList("car", "bus", "motarcycle", "cycle", "bottle", "name", "class");
		// before java8
		/*
		 * List<String> listinUppercase= new ArrayList<String>(); for (String string :
		 * lis) { listinUppercase.add(string.toUpperCase()); }
		 * System.out.println(listinUppercase);
		 */
		lis.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		// before java 8
		/*for (String string : lis) {
			System.out.print(string.length() + " ");
		}
		System.out.println();*/
		
		// after java
		// lis.stream().map(e->e.length()).forEach(e->System.out.print(e+" "));
		// lis.stream().map(e->e.length()).forEach(System.out::println);

		List<Integer> l = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);
		// before java 8
		for (Integer i : l) {
			System.out.print(i * 3 + " ");
		}
		System.out.println();
		//after java 8
		l.stream().map(e -> e * 3).forEach(e -> System.out.print(e + " "));

	}
}