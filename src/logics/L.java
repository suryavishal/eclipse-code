package logics;
// check weather is anagram or not a given string
import java.util.Arrays;

public class L {

	public static void main(String[] args) {
    
	String s1= "he is Aradhya";
    String s2= "is he HradAya";
     s1 = s1.replace(" ", "").toLowerCase();
     s2 = s2.replace(" ","").toLowerCase();
 
		char[] a= s1.toCharArray();
		char[] b= s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("they are anagram");
		}else {
			System.out.println("they are not an anagram");
				
			}
		}
		
	}
   

