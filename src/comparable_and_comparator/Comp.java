package comparable_and_comparator;
public class Comp implements Comparable<Comp>{
	private int empid;
	private String name;
	private String mobile;
	private String email;
	public Comp(int empid, String name, String mobile, String email) {//intilse by construtor
		super();
		this.empid = empid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}// getter only 
    public int getEmpid() {return empid;}public String getName() {return name;}public String getMobile() {return mobile;}
	public String getEmail() {return email;}
	@Override
      public int compareTo(Comp o) {
	//	return o.empid- this.empid;
	//	return o.name.compareTo(this.name);
	//	return o.mobile.compareTo(this.mobile);
	//  return o.email.compareTo(this.email);
	//  return this.empid- o.empid;
	//	return this.name.compareTo(o.name);
	//	return this.mobile.compareTo(o.mobile);
		return this.email.compareTo(o.email);
}
}		




