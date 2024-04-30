package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindGroupBy {

	public static void main(String[] args) {
List<String> al = Arrays.asList("ram","radha","rosani","reema","rohan","ram","radha","rosani","reema","rohan","rajesh","rohit","ramesh");
	//Map<Boolean, List<String>> collect = al.stream().collect(Collectors.partitioningBy(p->p.equals("ram")));
	//System.out.println(collect);
	//Map<Boolean, Long> collect1 = al.stream().collect(Collectors.partitioningBy(p->p.equals("ram"),Collectors.counting()));
	//System.out.println(collect1);
	//Map<Object, List<String>> collect2 = al.stream().collect(Collectors.groupingBy(p->p.equals("ram")));
	//System.out.println(collect2);
	//Map<Boolean, List<Object>> collect3 = al.stream().collect(Collectors.partitioningBy(p->p.equals("ram"),Collectors.mapping(p->p.toUpperCase(), Collectors.toList())));
	//System.out.println(collect3);
	//Map<Boolean, List<Object>> collect4 = al.stream().collect(Collectors.partitioningBy(p->p.equals("ram"),Collectors.mapping(p->p.toUpperCase(), Collectors.toList())));
	//System.out.println(collect4);
	}

}
