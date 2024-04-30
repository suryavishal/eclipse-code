package comparable_and_comparator;

import java.util.Comparator;

public class NameCom implements Comparator<A> {

	@Override
	public int compare(A o1, A o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
