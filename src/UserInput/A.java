package UserInput;

import java.io.Console;

public class A{
	
	public static void main(String[] args) {
		
	Console con =System.console();
	System.out.println("your name");
	
	String abc= con.readLine();
	// we can not run it from any ide environment
	//we have to run it from commond prompt
	
	System.out.println("my name is "+ abc);
	}
}


