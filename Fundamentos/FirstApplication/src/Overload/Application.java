package Overload;

public class Application {

	public static void main(String[] args) {
		Mathematic math = new Mathematic();
		
		int total = math.sum(2, 4);
		int totalZ = math.sum(4,  5, 8);
		int totalD = math.sum(44, 4.5f);
		
		System.out.println(total);
		System.out.println(totalZ);
		System.out.println(totalD);
		
	}
	
}
