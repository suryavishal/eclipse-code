package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SNTerminal {// fillter,map,flatMap,distinct,limit= non terminal; which return stream again
	                     //collect,count,forEach,reduce,min,max,to array= terminal ;

	public static void main(String[] args) {
     List<String> list = Arrays.asList("car","bus","cycle","bicycle","car","cycle","bicycle");
     
    //distinct
     list.stream().distinct().forEach(e->System.out.print(e+"  "));
    //count && lmit
     long l = list.stream().distinct().count();
     System.out.println(l);
     list.stream().limit(4).forEach(e->System.out.print(e+"  "));
     System.out.println();
    //max && min
     Optional<String> min = list.stream().min((a,b)->a.compareTo(b));
     Optional<String> max = list.stream().max((a,b)->a.compareTo(b));
     System.out.println(min);
     System.out.println(max);
     //reduce
     List<String> red= Arrays.asList("1","2","3","A","B","C");
     Optional<String> reduced = red.stream().reduce((value,combinevalue)->{return combinevalue+value;});
     System.out.println(reduced.get());
// Toarray
     
     Object[] array = red.stream().toArray();
	 for (Object object : array) {
		System.out.print(object);
	}
		
	}
	}


