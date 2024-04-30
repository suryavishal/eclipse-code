
package Sinoriq;

import java.util.HashSet;

public class ChotaMissNub {
	
	public static void main(String[] args) {
	ChotaMissNub a1 = new ChotaMissNub();
	System.out.println(a1.solution(new int [] {1,-2,-3,-4,-5,6,7,-1}));
	System.out.println(a1.solution(new int [] {-1,-2,-3,4,1,2}));
	System.out.println(a1.solution(new int [] {2,-1}));
    }
	public int solution(int [] A) {
    HashSet<Integer> hs = new  HashSet<Integer>();
		for (int i = 1; i < A.length+1000000; i++) {
			hs.add(i);	
		}
		for (int a : A) {
		hs.remove(new Integer(a));	
		}
		return hs.iterator().next();
	}
	}
