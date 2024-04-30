package java_8;

public class F {

	public static void main(String[] args) {
    String s1 ="hai i am your buddy";
    s1=s1.replace(" ", "");
    for (int i= s1.length()-1; i>=0 ; i--) {
    System.out.print(s1.charAt(i));	
    
	}
    System.out.println("\n");
    char c ;
    for (char i = 'a'; i <='z'; i++) {
    	if(i=='a'|| i=='e'|| i=='i'|| i=='o'||i=='u') {
    		
    	}else {
    		System.out.print(i +" ");
    	}
	}

	}}
