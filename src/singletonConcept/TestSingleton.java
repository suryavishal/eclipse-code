package singletonConcept;

public class TestSingleton {

	public static void main(String[] args) 
			   throws CloneNotSupportedException {

LazySingleton instance1 =  
                   LazySingleton.getInstance();
System.out.println(instance1.hashCode());

LazySingleton instance2 =  
                  (LazySingleton) instance1.clone();
System.out.println(instance2.hashCode());
}}


// here we are able to prevent our singleton to clone 