
package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empid;
	int deptid;
	String name;
	int salary;
	public Employee(int empid,int deptid,String name,int salary) {
		this.empid=empid;
		this.deptid=deptid;
		this.name=name;
		this.salary=salary;
	}
}
public class StremFillter{
	public static void main(String[] args) {
	
	List<Employee> list = new ArrayList<Employee>();
	list.add(new Employee(101, 25, "vishal",150000));
	list.add(new Employee(103, 10, "surya",450000));
	list.add(new Employee(102, 35, "anand",250000));
	list.add(new Employee(104, 45, "diwedi",650000));
	list.add(new Employee(105, 15, "sharavan",350000));
	list.add(new Employee(106, 21, "patel",260000));
	list.add(new Employee(107, 22, "vikram",170000));

	// give the department id which is greater then the 10
	/*list.stream().filter(p->p.deptid>10)
	                                    .forEach(p->System.out.print(p.deptid+" "));*/
	
    list.stream().filter(p->p.salary>250000).forEach(e->System.out.print(e.salary+" "));;
    System.out.println();	
    list.stream().filter(p->p.salary>250000).map(p->p.salary).forEach(e->System.out.print(e+" "));;
	System.out.println();
   
	//bajaj que get the id >10 && sort in reverse order on the salary basis
	List<Integer> list2 = list.stream().filter(id->id.deptid>10)
			.map(e->e.salary)
			      .sorted(Comparator.reverseOrder())
	                       .collect(Collectors.toList());
	System.out.println(list2);
	
	List<Integer> list3 = list.stream().filter(id->id.deptid>10)
			.map(e->e.salary)
			      .sorted((a,b)->b.compareTo(a))
	                       .collect(Collectors.toList());
	System.out.println(list3);
	
	List<Integer> list4 = list.stream().filter(id->id.deptid>10)
			.map(e->e.salary)
			      .sorted((a,b)->(a>b)?-1:(a<b)?1:0)
	                       .collect(Collectors.toList());
	System.out.println(list4);
}}
