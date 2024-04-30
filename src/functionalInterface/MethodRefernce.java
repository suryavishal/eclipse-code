package functionalInterface;

//interface intref{
//	public void Add(int a,int b);
//	
//}
//
//public class MethodRefernce {
//
//	public static void main(String[] args) {
//
//		intref i = (a,b)->System.out.println(a+b);
//		i.Add(10, 20);
//	}
//
//}

interface intref{
	public void Add(int a,int b);
}
public class MethodRefernce {
	private static void addition(int x,int y) {
		System.out.println( x+y);
	}
	public static void main(String[] args) {
		intref i1 = MethodRefernce::addition;
         i1.Add(10, 20);	
	
         intref i = (a,b)->System.out.println(a+b);
         i.Add(10, 20);
	}

}