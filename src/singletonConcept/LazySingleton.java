package singletonConcept;
public class LazySingleton extends Myclone{
	private static LazySingleton instance;
	private LazySingleton() {
	}
@Override
protected Object clone() throws
                          CloneNotSupportedException {
	throw new CloneNotSupportedException();
	}
public static synchronized LazySingleton 
                             getInstance() {
		if(instance==null) {
		return instance = new LazySingleton();
		}else {
    	return instance;
    	  
      }
      }}
