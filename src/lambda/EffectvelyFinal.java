package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

interface Multiple{
	public int Mul(int a,int b ,int c,int d,int e );
	
}

public class EffectvelyFinal {

	public static void main(String[] args) {
      Multiple mul =(a,b,c,d,e)->(a*b*c*d*e);
      System.out.println(mul.Mul(10, 10, 10, 10, 10));
       Function<Integer,Integer> f = i->(i*i);
       System.out.println(f.apply(10));
	}
   
}
