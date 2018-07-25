package PracticePolimorphism;

public class Pinacolata extends Drink {
	
	public Pinacolata() {
		super("Pinacolata", false);
	}

	
	@Override
	public void prepare() {
		System.out.println("Get the Cup");
		System.out.println("Open the coconut");
		System.out.println("Mix the Vodka and water of coconut");
		System.out.println("Add sugar");
	}
}
