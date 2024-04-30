package logics;
// so complicted programe for checking a palendrom are not
public class O {

	public static void main(String[] args) {
    String s1 = "too oOt";
    s1=s1.replace(" ", "").toLowerCase();
    
    char[] a = s1.toCharArray();
    int size =a.length;
    char[] b= new char [size];
   
    int i=0;
    while(i!=size) {
    b[size-1-i]=a[i];
    ++i;
    }
     i=0; 
     while(i!=size) {
    	 if(a[i]!=b[i]) {
    		 System.out.println("not a palindrom");
    		 System.exit(0);
    	 }else {
    		 ++i;
    		 continue;
    	 }
    	 
     }
    	System.out.println("is a palendrom"); 
    }
	
     }


