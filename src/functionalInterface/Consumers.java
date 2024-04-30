package functionalInterface;

import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {

		Consumer<String> c = s->System.out.println(s);
		c.accept("vishal");
	}

}
