package Sngleton_mutable_customisedException;

import java.util.Scanner;

public class Votar {

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
System.out.println("please enter ur age----->");
int i = scan.nextInt();

if(i<18) {
try {
throw new VotarException("hey bro you are not eligible yet");
}catch (Exception e) {
e.printStackTrace();
}
}else {
System.out.println("great! you are eligible");
	}
}

}
