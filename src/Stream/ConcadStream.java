package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcadStream {

	public static void main(String[] args) {

		
		List<String> domesticAnimals= Arrays.asList("dog","cat","cow","buffalo","goat");
		List<String> nonDomesticAnimals = Arrays.asList("lion","jakal","wolf","bear","dear");
		
		Stream<String> stream1 = domesticAnimals.stream();
		Stream<String> stream2 = nonDomesticAnimals.stream();
	
         List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());
	     System.out.println(list);
	}

}
