package Sngleton_mutable_customisedException;

public class A {
	static A a1=null;
	private A(){
	}
public static A inits() {
	if(a1==null) {
		return a1= new A();
	}
	return a1;

}
}
