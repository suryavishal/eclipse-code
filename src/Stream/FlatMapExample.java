package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	String name;
	int sid;
	char grade;
	public Student(String name, int sid, char grade) {
		this.name = name;
		this.sid = sid;
		this.grade = grade;
	}
	
}

public class FlatMapExample {
public static void main(String[] args) {
	List<Student> students= new ArrayList<Student>();
	students.add(new Student("roy", 12, 'A'));
	students.add(new Student("rohit", 14, 'b'));
	students.add(new Student("ramesh", 13, 'A'));
	
	
	List<Student> students1= new ArrayList<Student>();
	students1.add(new Student("suresh", 11, 'c'));
	students1.add(new Student("raina", 10, 'f'));
	students1.add(new Student("divya", 15, 'A'));
	
  List<List<Student>> finalStu = Arrays.asList(students,students1);
  
  List<String> name1 = finalStu.stream().flatMap(name->name.stream()).map(s->s.name).collect(Collectors.toList());
  System.out.println(name1);

}
	
}
