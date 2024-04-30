package functionalInterface;

import java.util.function.Predicate;

public  class Predicates{
	 
	public static void main(String[] args) {
		
		String [] s= {"ram","manoj","sanjay","shravan","ashish"};
		Predicate<String> p = s1->s1.length()>5;
		
		for (String s1 : s) {
			if(p.test(s1))
			{
				System.out.println(s1);
			}
		}
	}
 }