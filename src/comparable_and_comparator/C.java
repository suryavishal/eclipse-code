package comparable_and_comparator;// comparator on class A
import java.util.ArrayList;
import java.util.Collections;
public class C {
	public static void main(String[] args) {
		ArrayList<A> al = new ArrayList<A>();
		al.add(new A(100, "ram", "9898989898", "ram@gmail.com"));
		al.add(new A(101, "shyam","7878787878", "shyam@gmail.com"));
		al.add(new A(111, "ghanshyam",  "9999999999", "ghanshyam@gmail.com"));
		al.add(new A(115, "gauri",  "9999888888", "gauri@hotmail.com"));
		al.add(new A(105, "radha", "9877899877", "radha@krishna.com"));
	System.out.println("----------------------------------------");
        NameCom nc = new  NameCom();
     	Collections.sort(al,nc);
     	for (A a : al) {
     	System.out.println(a.getEmpid()+"  "+a.getName()+" "+a.getMobile()+" "+a.getEmail());}
     	System.out.println("----------------------------------------");
	EmpidCom ei = new EmpidCom();
	Collections.sort(al,ei);
	for (A a : al) {
		System.out.println(a.getEmpid()+"  "+a.getName()+" "+a.getMobile()+" "+a.getEmail());	
	}
	System.out.println("----------------------------------------");
    MobilCom mc = new MobilCom(); 
    Collections.sort(al,mc);
    for (A a : al) {
		System.out.println(a.getEmpid()+"  "+a.getName()+" "+a.getMobile()+" "+a.getEmail());	
	}
}}