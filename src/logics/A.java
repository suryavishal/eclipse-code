package logics;
//delete the duplicate elements from array work only on sorted arrays
public class A{
	
	public static void main(String[] args) {
	int [] x = {1,1,2,2,3,3,4,4,5,5,6,6,7,7};
	int [] temp= new int[x.length];
	int j=0;
	for (int i = 0; i < x.length-1; i++) {
		if (x[i]!=x[i+1]) {
			temp[j]=x[i];
			j++;
		}	
	}	
		temp[j]=x[x.length-1];
		for (int i : temp) {
		if (i!=0) {
		System.out.print(i+ " ");
				}
			}
		
	
		}
			
		
	}
