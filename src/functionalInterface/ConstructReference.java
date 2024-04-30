package functionalInterface;

class Student{
	String name;
	int rollno;
	int marks;
	int age;
	
	public Student(String name, int rollno, int marks, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}
}
 interface Intrf{
	 public Student get (String name, int rollno, int marks, int age);
 }
// class Demo implements Intrf{
//	@Override
//	public Student get(String name, int rollno, int marks, int age) {
//		Student s = new Student(name, rollno, marks, age);
//		return s;
//	}
// }
public class ConstructReference {
	public static void main(String[] args) {
     //Intrf i=(name, rollno, marks, age)->new Student(null, 0, 0, 0);
     Intrf i1=Student::new;
		Student student = i1.get("ram", 35, 85, 10);
		System.out.println(student);
	}

}
