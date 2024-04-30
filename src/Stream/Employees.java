package Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
public class Employees{
	public int empid;
	public String name;
	public int age;
	public int salary;
	public Employees(int empid, String name, int age, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [Empid="+ empid +",Name=" +name+ ",age=" + age +",Salary="+ salary +"]\n";
	} 
	public static void main(String[] args) {
		ArrayList<Employees> employee = new ArrayList<Employees>();
		employee.add(new Employees(10, "rahul", 32, 500000));
		employee.add(new Employees(12, "rajesh", 28, 510000));
		employee.add(new Employees(13, "rakul", 32, 530000));
		employee.add(new Employees(17, "ramesh", 24, 580000));
		employee.add(new Employees(14, "sarmesh", 32, 550000));
		employee.add(new Employees(16, "Vishal", 25, 590000));
		employee.add(new Employees(01, "Abhay", 33, 520000));
		
		/*return the employee object or any variable on any kind of filter or sorting */
// return the employee object whose age >30 && comparing on the behalf of salary sorted 	 

		List<Employees> list = employee.stream().filter(e->e.getAge()>30)
                                        .sorted(Comparator.comparing(e->e.getSalary()))
                                                                   .collect(Collectors.toList());
     	System.out.println(list);   	
// return the employee object whose age >30 && comparing on the behalf of salary sorted by method reference 
     	
     	List<Employees> list2 = employee.stream().filter(e->e.getAge()>30)
     	             .sorted(Comparator.comparingInt(Employees::getSalary))
     	                                                 .collect(Collectors.toList());
    	System.out.println(list2);
//return the employee name or any variable; whose age >30 && comparing on the behalf of salary sorted by method reference 
    	
    	List<String> list3 = employee.stream().filter(e->e.getAge()>30)
	             .sorted(Comparator.comparingInt(Employees::getSalary)).map(e->e.getName())
	                                                              .collect(Collectors.toList());
	System.out.println(list3);
	System.out.println();
	
	
//partitioningBy-> take predicate as input an return Map(key= Boolean,values =List<Employees>)

	
	Map<Boolean, List<Employees>> map = employee.stream()
			              .collect(Collectors.partitioningBy(e->e.getAge()>30));	
	map.forEach((K,V)->System.out.println("key is = "+ K +"\n values \n"+ V ));
	
System.out.println("----------------------------------------------------------------------------------------------------");

// groupingBy-> take predicate and return the Map (key= object ,value =list<employees>)

    Map<Object, List<Employees>> map2 = employee.stream().collect(Collectors.groupingBy(e->e.getAge()));
	map2.forEach((k,v)->System.out.println("keys is = "+ k +"\n values \n"+v));

System.out.println("----------------------------------------------------------------------------------------------------");

// joining() methods 
           String string = employee.stream().map(e->e.getName())
                                             .sorted((a,b)->b.compareTo(a))
                                                            .collect(Collectors.joining(" , "));
           System.out.println(string);

//reducing 
/* it take binary opertor as input and gave output as per our given conditions and binaryoperator take the 
    bifuncton as a input and return the same object as per conditions */         
   
   BinaryOperator<String> binaryoperator= (a,b)->a.concat(b);
   Optional<String> reducedString = employee.stream().map(e->e.name)
		            .collect(Collectors.reducing(binaryoperator));
   System.out.println(reducedString);
		   
//Avarageing int,double,long but return the arthematic mean of the input integer 
   
   Double Avg = employee.stream().collect(Collectors.averagingInt(e->e.getSalary()));	
	System.out.println(Avg);
	
//Summering 
	IntSummaryStatistics statistics = employee.stream().map(e->e.salary)
			                    .collect(Collectors.summarizingInt(e->e));
	System.out.println(statistics);
	System.out.println(statistics.getSum());
	System.out.println(statistics.getAverage());
	System.out.println(statistics.getCount());
	System.out.println(statistics.getMax());
    System.out.println(statistics.getMin());

    
	
    
	}
	
}
