package PracticePolimorphism;

public class Preparated {
	
	public void preparatedDrink(Drink drink) {
		System.out.println("Drink prepared: " + drink.getName());
		drink.prepare();
		
		if(drink.isBurn()) {
			System.out.println("Burning the drink " + drink.getName());
		}
		
		System.out.println("Drink prepared done!");
	}

}
