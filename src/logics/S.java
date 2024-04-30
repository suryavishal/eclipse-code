     package logics;

     import java.util.Scanner;

     public class S {

	 public static void main(String[] args) {
		int mul=1;
     Scanner sc = new Scanner(System.in);
     System.out.println("please enter the number for table:-- ");
     int x =sc.nextInt();
     for (int i = 1; i <=10; i++) {
	 mul= x*i;
	 System.out.println(mul);
     }
	}

    }
