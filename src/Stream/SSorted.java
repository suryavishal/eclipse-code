package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SSorted {

	public static void main(String[] args) {
      
		List<Integer> list = Arrays.asList(1,5,6,4,7,8,9,5,6,4,5);
		List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());//natural sort
        Set<Integer> list3 = new TreeSet<Integer>(list2) ;  //remove duplicate element     
		System.out.println(list2);
        System.out.println(list3);
	    List<Integer> list4 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list4);
	}

}
