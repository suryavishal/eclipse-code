package java_8;

@FunctionalInterface
interface Math {
 public void Apple(int a ,int b);
}
public class A {

	public static void main(String[] args) {
	Math a1 = (a,b)->System.out.println("the Sum = "+(a+b));
	Math a2 =(x,y)->System.out.println("the multiply ="+(x*y));
	Math a3=(c,d)->System.out.println("the divide ="+(c/d));
	Math a4=(e,f)->System.out.println("the subtract"+(e-f));
	a1.Apple(10,20);// add
	a2.Apple(100,100);//mul
	a3.Apple(12,6);//divide
	a4.Apple(100,52);//subtract
	}
	
		}