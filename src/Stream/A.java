package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	for (int i = 100; i >0; --i) {
		al.add(i);
	}
System.out.println(al+" ");
System.out.println("-----------------------------------------------");
List<Integer> list = al.stream().filter(m->m%2==0).filter(m->m%5==0).map(m->m-5).map(m->m+10).collect(Collectors.toList());
System.out.println(list+" ");
System.out.println("\n");
List<Integer> list1 = al.stream().sorted((i1,i2)->(i1<i2)?-1:(i1>i2)?+1:0).collect(Collectors.toList());
System.out.println(list1+" ");
System.out.println("-----------------------------------------------");
Optional<Integer> min = al.stream().min((i1,i2)->(i1<i2)?-1:(i1>i2)?+1:0);	
System.out.println(min);
long l = al.stream().count();
System.out.println("they are in number->"+l);

	StringBuffer s1 = new StringBuffer("manoj");
	s1.reverse();
	System.out.println(s1);
	}
	
}