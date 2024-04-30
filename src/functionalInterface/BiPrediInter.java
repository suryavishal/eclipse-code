package functionalInterface;

import java.util.function.BiPredicate;
//requirement take two input interger and add them then check whether it is even or not  
public class BiPrediInter {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> bp =(a,b)->(a+b)%2==0;
		System.out.println(bp.test(10,20));
	    System.out.println(bp.test(15,20));

}}
