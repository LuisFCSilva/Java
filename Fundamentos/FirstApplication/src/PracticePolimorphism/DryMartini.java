package PracticePolimorphism;

public class DryMartini extends Drink {

	public DryMartini() {
		super("DryMartini", true);
	}
	
	@Override
	public void prepare() {
		System.out.println("Get the Cup");
		System.out.println("Insert the Vodka");
		System.out.println("Mixer");
	
	}

}
