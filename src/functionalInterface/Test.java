package functionalInterface;

public class Test {
	private void m1() {
		for (int i = 0; i < 11; i++) {
			System.out.println("m1 method");
		}
	}
	public static void main(String[] args) {
	Test t1 = new Test();
		
		Runnable r = t1::m1;
//		Runnable r =()->{
//			for (int i = 0; i < 11; i++) {
//				System.out.println("run method");
//			}
//		};

		Thread t2= new Thread(r);
		t2.start();
		for (int i = 0; i < 11; i++) {
			System.out.println("main method");
		}
	}

}
