package logics;
// simple program for check a palindrome or not.

public class P {

	public static void main(String[] args) {
    String s1= "level";
    String s2="";
    int size =s1.length();
    for (int i = size-1; i>=0; i--) {
    	s2=s2+s1.charAt(i);
	}
    System.out.println(s2);
	if(s1.equals(s2)) {
		System.out.println("palindrome");
	}else {
			System.out.println("not a palindrome");
		}
		
	}
	}


