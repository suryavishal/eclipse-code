package Sngleton_mutable_customisedException;

public class B {

	public static void main(String[] args) {
    A a1=A.inits();
    A a2=A.inits();
    System.out.println(a1==a2);
    System.out.println(a1);
    System.out.println(a2);
	}

}
