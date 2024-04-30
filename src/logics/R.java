package logics;

import java.util.Scanner;

public class R {

	public static void main(String[] args) {
		int sum =0;
     Scanner sc = new Scanner(System.in);
     System.out.println("please enter the natural number for find sum");
     int x=sc.nextInt();
     for (int i = 0; i <= x; i++) {
	 sum= sum+i;
	
    }
	System.out.println(sum);
	}

}
