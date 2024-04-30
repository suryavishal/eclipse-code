package logics;

import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your no");
		int x=scan.nextInt();
		int fact = 1;
		for (int i = 1; i <=x; i++) {
			fact= fact*i;
			
		}
	System.out.println("factorial of your number is:--"+fact);
	}
}
