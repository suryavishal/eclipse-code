package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class E {
	public static void main(String[] args) {
	
		
List<Integer> al = Arrays.asList(12,11,10,15,14,18,17,19,12,14,10,18);
	
   al.forEach(i->System.out.println(i));
   List<Integer> list2 = al.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?1:0).collect(Collectors.toList());
   System.out.println(list2);
    
   
    Optional<Integer> min = al.stream().min((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0);
    Integer i = min.get();
    System.out.println(i);

    Set<Integer> s= new TreeSet<Integer>(al);	
	System.out.println(s);
	

	
	List<Integer> list = al.stream().map(m->m).filter(m->m%2==1).collect(Collectors.toList());
	System.out.println(list);
	}
	

}
