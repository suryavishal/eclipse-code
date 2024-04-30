package lambda;
@FunctionalInterface
interface Add{
int add(int a,int b);
}
public class Functional {
public static void main(String[] args) {
Add c=(a,b)->(a+b);
System.out.println(c.add(10, 20));
	}
}
/*
@FunctionalInterface   
interface Sub{
int Sub(int a,int b);
}
public class Functional{
public static void main(String [] args) {
Sub sub=(a,b)->(a-b);
System.out.println(sub.Sub(20, 10));
*/
  /* 
@FunctionalInterface
interface Div {
double Div(float a, float b);
}
public class Functional {
public static void main(String[] args) {
Div div = (a, b) -> (a / b);
System.out.println(div.Div(11f, 12f));
*/
/*
@FunctionalInterface
interface Mul{
double mul(float a,float b);
}
public class Functional{
public static void main(String[] args) {
Mul m=(a,b)->(a*b);
System.out.println(m.mul(12.34f, 13.22f));
*/
		

