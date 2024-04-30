package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class A{
	   public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "vishal");
		hm.put(2, "Sharvan");
		hm.put(5, "anand");
		hm.put(7, "Chotu");
		System.out.println(hm);
		Set<Integer> set = new HashSet<Integer>();
		Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        for (Entry<Integer, String> entry : entrySet) {
        System.out.print(entry);
        
        Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
 		lhm.put(1, "vishal");
 		lhm.put(2, "Sharvan");
 		lhm.put(5, "anand");
 		lhm.put(7, "Chotu");
 		System.out.println(lhm);
 		Set<Integer> set1 = new HashSet<Integer>();
 		Set<Map.Entry<Integer, String>> entrySet1 = lhm.entrySet();
        for (Entry<Integer, String> entry1 : entrySet) {
        System.out.print(entry1);
		
        Map<Integer, String> thm = new TreeMap<Integer, String>();
 		lhm.put(1, "vishal");
 		lhm.put(2, "Sharvan");
 		lhm.put(7, "Chotu");
 		lhm.put(5, "anand");
 		
 		System.out.println(thm);
 		Set<Integer> s2 = new HashSet<Integer>();
 		Set<Map.Entry<Integer, String>> entrySet2 = thm.entrySet();
        for (Entry<Integer, String> entry2 : entrySet) {
        System.out.print(entry2);
        }
	   }
	
}}}