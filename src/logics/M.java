package logics;
//compute the length of string witout using length method.
public class M {

	public static void main(String[] args) {
     String s1= "hai how are you";
     s1 =s1.concat("0)");
     char[] cs = s1.toCharArray();
     
     int count =0;
     int i=0;
     while (cs[i]!='0') {
    	 count++;
    	 i++;
	}
	System.out.println(count);
	}

}
