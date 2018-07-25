package PracticePolimorphism;

public class Drink {
	
	private String name;
	private boolean burn;
	
	public Drink(String name, boolean burn) {
		this.name = name;
		this.burn = burn;
	}

	public String getName() {
		return name;
	}
	
	public boolean isBurn() {
		return burn;
	}
	
	public void prepare() {
		
	}
	
}
