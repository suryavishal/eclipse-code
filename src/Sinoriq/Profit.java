package Sinoriq;

public class Profit {

	public static void main(String[] args) {
     Profit p = new Profit();
     System.out.println(p.maxProfit(new int[] {4,1,8,7,2,6}));
	}
	public int maxProfit(int [] a) {
	   int maxprofit =0;
	   int minSofar=a[0];
	   
	  for (int i = 0; i < a.length; i++) {
		minSofar = Math.min(minSofar, a[i]);
		int profit = a[i]-minSofar;
		maxprofit=Math.max(maxprofit, profit);
	  }
		return maxprofit;
		} 
	} 

