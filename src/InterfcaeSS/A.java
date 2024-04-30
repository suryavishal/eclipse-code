package InterfcaeSS;

import java.util.Scanner;

public class A {

public static void main(String [] args){
int temp=0;
int [] x = {10,11,12,16,14,15,18,20};
Scanner scan = new Scanner(System.in);
System.out.println("please enter the number");
int y=scan.nextInt();

for (int i=0;i<x.length;i++){

if(x[i]==y){
System.out.println("your nub present at index :-"+i);
temp= temp+i;
}}
if(temp==0){
System.out.println("your search is not present");
}
}}
