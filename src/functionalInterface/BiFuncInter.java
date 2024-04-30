package functionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int EmpNub;
    String EmpName;
	public Employee(int empNub, String empName) {
		this.EmpNub = empNub;
		this.EmpName = empName;
	}
    
    
}
public class BiFuncInter {
// take EmpNub,EmpName as input in function And return the employee object;
	public static void main(String[] args) {
     ArrayList<Employee> l = new ArrayList<Employee>();
     BiFunction<Integer, String, Employee> f = (EmpNub,EmpName)->new Employee(EmpNub, EmpName);
     l.add(f.apply(100, "vishal"));
     l.add(f.apply(101, "Shravan"));
     l.add(f.apply(102, "Anand"));
     l.add(f.apply(103, "Sunil"));
     l.add(f.apply(104, "Piyush"));
     
     
     for (Employee e : l) {
    	 System.out.println("employee number:"+e.EmpNub);
    	 System.out.println("employee name :"+e.EmpName);
		 System.out.println();
	}
     
		
	}

}
