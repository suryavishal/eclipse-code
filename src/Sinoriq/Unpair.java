package Sinoriq;

public class Unpair {
	
	public static int findunpair(int [] unpair) {
		int [] num = {9,3,9,3,7,9};
		int unpairNum=0;
		
		for (int i = 0; i < num.length; i++) {
			int checkpoint =0;
			int cacheNumber=num[i];
		for (int n= 0; n < num.length; n++) {
			if(cacheNumber == num[n]) {
				checkpoint++;
			}
		}
		if (checkpoint<2) {
			unpairNum =cacheNumber;
		}
		}
		return unpairNum;
	}
	public static void main(String[] args) {
	int [] unpair = {9,3,9,3,7,9};
    System.out.println("unpair number is"+"-->"+findunpair(unpair));
	}

}
