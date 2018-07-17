package ClassObjects;

public class Application {
	
	public static void main(String[] args) {
		
		People john = new People();
		john.name = "Johnson";
		john.numberOfPics = 0;
		
		People mary = new People();
		mary.name = "Mary";
		mary.numberOfPics = 0;
		
		john.receiver(12);
		john.delivered(10, mary);
		
		System.out.println("Total of pics: " + john.name + " " + john.totalPics());
		System.out.println("Total of pics: " + mary.name + " " + mary.totalPics());
		
	}

}
