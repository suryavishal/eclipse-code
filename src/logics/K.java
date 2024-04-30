package logics;
//binary search
import java.util.Scanner;

public class K {// binary search in array
	public static void main(String[] args) {
    int [] a= {2,5,7,9,12,14,16,17,19,20,24,28};
    Scanner scan = new Scanner(System.in);
    System.out.println("enter your number");
    int x=scan.nextInt();
    int li=0;
    int hi=a.length-1;
    int mi=(li+hi)/2;
    
    while(li<=hi) {
    if(a[mi]==x) {
    System.out.println("element at index :-> "+mi);
    break;
    }else if(a[mi]<x) {
    	li=mi+1;
    }else {
    	hi=mi-1;
    }
    mi=(li+hi)/2;
	}
	
if(li>hi) {
	System.out.println("element not found");
}
}
	}
