package logics;

import java.util.Scanner;
// linear search
public class F {

	public static void main(String[] args) {
    int [] x= {1,2,3,5,4,6,7,8,9,15};
	Scanner sc= new Scanner(System.in);
	System.out.println("enter for search");
	int item =sc.nextInt();	
	 int temp=0; 
	for (int i = 0; i < x.length; i++) {
		if (x[i]==item) {
			System.out.println("your entry are present index at:--"+i);
		    temp= temp+i;
		}
	}if(temp==0) {
		System.out.println("sorry brother not found");
	}
			
		}
		
	
	}


