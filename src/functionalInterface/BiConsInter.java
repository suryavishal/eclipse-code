package functionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee1{
    String Name;
    double salary;
	public Employee1(String name, double salary) {
		this.Name = name;
		this.salary = salary;
	}
	
	}
public class BiConsInter {
// take EmpNub,EmpName as input in function And return the employee object;
public static void main(String[] args) {
	ArrayList<Employee1> l1 = new ArrayList<Employee1>();
	populate(l1);
	BiConsumer<Employee1, Double> c=(e,d)->e.salary=e.salary+d;
	for (Employee1 e : l1) {
		
		c.accept(e, 500.00);	
	}
       for (Employee1 e : l1) {
		System.out.println("employee name:"+e.Name);
		System.out.println("employee salary:"+e.salary);
		System.out.println();
	}
}
	public static void populate(ArrayList<Employee1>l1) {
		
	
     l1.add(new Employee1("vishal",1000000));
     l1.add(new Employee1("shravan",100000));
     l1.add(new Employee1("Anand",150000));
     l1.add(new Employee1("abhi",10000));
     l1.add(new Employee1("ram",100000000));
}

}