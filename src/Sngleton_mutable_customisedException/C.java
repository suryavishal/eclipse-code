package Sngleton_mutable_customisedException;

final public class C {
	int i=20;
	C(int i){
		this.i=i;
	}
	public C mut(int i) {
		if(this.i==i) {
		return this;
		}else {
			return new C(i);
		}
	}
	public static void main(String[] args) {
		C c1=new C(10);
		C c2= c1.mut(100);
		C c3= c1.mut(10);
		System.out.println(c1==c2);
		System.out.println(c1==c3);

	}

}
