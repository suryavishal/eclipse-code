package logics;
//another way to reverse the string 
public class N {

	public static void main(String[] args) {
     String s1 ="vishal kumar gupta";
     char[] cs = s1.toCharArray();
     int size= cs.length;
     char [] a= new char[size];
     
     int i=0;
     while(i!=size) {
    	 a[size-1-i]=cs[i]; //a[i]=cs[i]//copying a string into another 
    	 i++;
     }
	System.out.println(cs);
	System.out.println(a);
	}

}
