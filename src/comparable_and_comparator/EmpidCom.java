package comparable_and_comparator;

import java.util.Comparator;

public class EmpidCom implements Comparator<A>{

	@Override
	public int compare(A o1, A o2) {
		
    if (o1.getEmpid()<o2.getEmpid()) {
	return -1;
    }else if (o1.getEmpid()>o2.getEmpid()) {
	return +1;
    }else {
		return 0;
	}
	
}
		
	}

	

