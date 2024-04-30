package comparable_and_comparator;// comparable example comp class

import java.util.ArrayList;
import java.util.Collections;

public class B {

	public static void main(String[] args) {

		ArrayList <Comp>al= new ArrayList <Comp>();
		al.add(new Comp(100, "ram", "9898989898", "ram@gmail.com"));
		al.add(new Comp(101, "shyam","7878787878", "shyam@gmail.com"));
		al.add(new Comp(111, "ghanshyam",  "9999999999", "ghanshyam@gmail.com"));
		al.add(new Comp(115, "gauri",  "9999888888", "gauri@hotmail.com"));
		al.add(new Comp(105, "radha", "9877899877", "radha@krishna.com"));
	
		Collections.sort(al);
        for (Comp c : al) {
        System.out.println(c.getEmpid()+" "+c.getName()+" "+c.getMobile()+" "+c.getEmail());
	
}	
	
	}

}
