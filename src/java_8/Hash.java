package java_8;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//we can either use linkedhashmap/treemap as per need
public class Hash {
	public static void main(String[] args) {
Map<Integer, Employee> hash= new 
                     HashMap<Integer, Employee>();
		
		Employee e1= new Employee(01, "Omkar");
		Employee e2= new Employee(02, "sunil");
		Employee e3= new Employee(03, "vishal");
		Employee e4= new Employee(04, "anand");
		Employee e5= new Employee(05, "Shravan");
		
		hash.put(e1.getEmpid(), e1);
		hash.put(e2.getEmpid(), e2);
		hash.put(e3.getEmpid(), e3);
		hash.put(e4.getEmpid(), e4);
		hash.put(e5.getEmpid(), e5);
	
Set<Map.Entry<Integer, Employee>> entry
     = hash.entrySet();
		for (Map.Entry<Integer, Employee> e : entry) {
			System.out.println(e.getKey());
			Employee ez= e.getValue();
			ez.displays();
		}
	}

}
