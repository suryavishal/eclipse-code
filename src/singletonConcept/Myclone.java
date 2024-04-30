package singletonConcept;

public class Myclone implements Cloneable{
	
	@Override
	protected Object clone()
			throws CloneNotSupportedException {
		return super.clone();
	}

}
