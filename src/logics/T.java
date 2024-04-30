        package logics;

        import java.util.Scanner;

        // print the prime number
        public class T {

	    public static void main(String[] args) {
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number upto which need the prime num");
		int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
	    for (int j = 2; j <=i-1; j++) {
			if (i%j==0) {
				temp=temp+1;
			}
	    }
				if(temp==0) {
				System.out.print(i+" ");
				}else {
					temp=0;
				}
	 
}  
	}

}
