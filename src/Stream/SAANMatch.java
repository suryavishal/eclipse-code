package Stream;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SAANMatch {

	public static void main(String[] args) {
		
		Set<String> fruit = new HashSet<String>();
		fruit.add("one apple");
		fruit.add("two banana");
		fruit.add("one culiflower");
		fruit.add("three mango");
		fruit.add("one straberry");
		fruit.add("two papaya");
	
		//anyMatch();
	boolean b = fruit.stream().anyMatch(val->{return val.startsWith("one");});
	System.out.println(b);
	
	//allMatch();
	boolean c = fruit.stream().allMatch(val->{return val.startsWith("one");});
	System.out.println(c);
	
	//noneMatch();
	boolean d = fruit.stream().noneMatch(val->{return val.startsWith("one");});
	System.out.println(d);
	
	//findAny();
	//if we take empty list the return no Such element in string 
	Optional<String> any = fruit.stream().findAny();
	System.out.println(any.get());
	
	//findFirst()
	//if we take empty list the return no Such element in string 
	Optional<String> first = fruit.stream().findFirst();
	System.out.println(first.get());
	
	}
}
