package parameters;

public class Application {
	
	public static void main(String[] args) {
		
		Operation o = new Operation();
		
		int x = 10;
		o.change(x);
		
		System.out.println(x);
	}

}
