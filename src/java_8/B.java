package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class B{
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(10,20,30,12,10,20,21);
		
		Iterator i2 = al.iterator();
		while(i2.hasNext()) {// reverse the list
		Collections.reverse(al);
		System.out.print(i2.next()+" ");}
		System.out.println("---------------------------------------------------------------------");
		
		Iterator i1 = al.iterator();//reverse and sort in desending order
		Comparator<Object> order = Collections.reverseOrder();
		Collections.sort(al,order);
		while(i1.hasNext()) {
		System.out.print(i1.next()+"  ");
		}
		
		
	
		
		
		
		
		
		
		System.out.println("---------------------------------------------------------------------");
		Set<Integer> s= new HashSet<Integer>(al); //remove the duplicate value
		System.out.println(s);
		Set<Integer> s2 = new LinkedHashSet<Integer>(al);//remove and maintain the insersion order
		System.out.println(s2);
		Set<Integer> s1 = new TreeSet<Integer>(al);//remove and sort also.
		System.out.println(s1);
		
		//find the number which starts with the any value example "1"
	    List<Integer> list = al.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("1")).
	    		                                            map(Integer::valueOf).collect(Collectors.toList());
	    System.out.println(list);
		
	}

	private static Iterator Iterator(Comparator<Object> order) {
		// TODO Auto-generated method stub
		return null;
	}
}

