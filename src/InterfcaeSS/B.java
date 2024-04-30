package InterfcaeSS;

import java.util.Scanner;

public class B {
	
public static void main(String[] args) {
	
	int [] x= {11,12,13,14,15,18,20,21,28};
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter the number for search");
	int y = scan.nextInt();
	int li=0;
	int hi=x.length-1;
	int mi=(li+hi)/2;
	
	while(li<=hi) {
	if(x[mi]==y) {
		System.out.println("element present at index- "+mi);
		break;
	}
	  else if(x[mi]<y) {
		li=mi+1;
	}else {
		hi=mi-1;
	}
	mi=(li+hi)/2;
	}
if(li>hi) {
	System.out.println("your search is not found");
	
}	
}}
