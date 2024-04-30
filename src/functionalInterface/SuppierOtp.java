package functionalInterface;

import java.util.function.Supplier;

public class SuppierOtp {

	public static void main(String[] args) {

		Supplier<String> s=()->{
			String otp="";
			for (int i = 0; i<11; i++) {
				otp=otp+(int)(Math.random()*10);
			}
		  return otp;
		};
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	}

}
