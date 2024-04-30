package logics;
// Bubble sort
public class B {

	public static void main(String[] args) {
     int [] x= {76,58,45,36,32,48,56};
     for (int j = 0; j < x.length-1; j++) {
     for (int i = 0; i < x.length-1; i++) {
		 if(x[i]>x[i+1]) {
			 int temp =x[i];
			    x[i]=x[i+1];
			    x[i+1]=temp;
	}
    }
   }
    for (int i : x) {
	System.out.print(i +" ");
	}
   // System.out.println(" ");
    //System.out.print("first maximum salary is :--"+x[x.length-1]);
	}}