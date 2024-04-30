package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {

	public static void main(String[] args) {

		//example 1--->
	/*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	list.stream().map(e -> e * 2).forEach(e -> System.out.print(e + " "));

	List<Integer> lst1 = Arrays.asList(1, 2, 3);
	List<Integer> lst2 = Arrays.asList(4, 5, 6);
	List<Integer> lst3 = Arrays.asList(7, 8, 9);
	List<Integer> lst4 = Arrays.asList(10, 11, 12);

	List<List<Integer>> finallist = Arrays.asList(lst1, lst2, lst3, lst4);
	finallist.stream().flatMap(e->e.stream()).forEach(e->System.out.print(e+" "));
	System.out.println();
	List<Integer> list2 = finallist.stream().flatMap(e->e.stream()).collect(Collectors.toList());
	System.out.println(list2);
	
	*///example 2--->
		
	List<String> teamA = Arrays.asList("rohit", "dhawan", "virat");
	List<String> teamB = Arrays.asList("kunal", "hardik", "ashwin");
	List<String> teamC = Arrays.asList("bumarah", "cahal", "shami");
	
	List<List<String>> finalteam=  new ArrayList<List<String>>();
	finalteam.add(teamA);
	finalteam.add(teamB);
	finalteam.add(teamC);
	// Before java 8
	/*for(List<String> team:finalteam)
		for (String name : team) {
			System.out.print(name+" ");	
		}
	System.out.println();
	*/
	List<String> finalplayer = finalteam.stream().flatMap(player->player.stream()).collect(Collectors.toList());
	System.out.println(finalplayer);
	
	
	
	}
}
