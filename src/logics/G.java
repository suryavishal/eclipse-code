package logics;

import java.util.Scanner;

public class G {
	//linear search for strings 

	public static void main(String[] args) {
    String [] str = {"vishal","anand","shravan","sunil","sanjay","vikram"};
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter your name");
    String s1= scan.next();
    int temp=0;
    for (int i = 0; i < str.length; i++) {
	if (str[i].compareTo(s1)==0) {
		System.out.println("your name at index  " +i);
	temp= temp+1;
	}
	}
    if(temp==0)
	System.out.println("sorry not found!!");
	}}


