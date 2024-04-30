package logics;
     // check for input data are equal in number or not
import java.util.Scanner;

public class E {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("enter the braces");
     String s1 =scan.next();
     int count1 =0;
     int count2 =0;
     
     for (int i = 0; i < s1.length(); i++) {
    	 if (s1.charAt(i)=='(') {
    		 count1++;
    	 } else if(s1.charAt(i)==')') {
    			 count2++;
			}
    	 }
if(count1== count2) {
	System.out.println("equal");
}else {
	System.out.println("not equal");
}}}
