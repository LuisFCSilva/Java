package Static;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(Mathmatic.sum(8, 9));
		
		/*Counter c1 = new Counter();
		c1.increment();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		System.out.println(c1.getValue());
		System.out.println(c2.getValue());
		System.out.println(c3.getValue());*/
		
		Counter.increment();
		Counter.increment();
		Counter.increment();
		Counter.increment();
		
		System.out.println(Counter.getValue());
		
		System.out.println(Constant.NOTE);
		
		
	}

}
