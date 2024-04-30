package java_8;
public class Employee {
	private int empid;
	private String ename;
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;	
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void displays() {
System.out.println( "empid->"+getEmpid()+
		" ename->"+getEname());
	}
}
