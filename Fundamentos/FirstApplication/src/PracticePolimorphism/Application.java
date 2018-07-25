package PracticePolimorphism;

public class Application {
	
	public static void main(String[] args) {
		
		DryMartini dry = new DryMartini();
		Preparated prep = new Preparated();
		
		//prep.preparatedDrink(dry);
		
		Pinacolata pina = new Pinacolata();
		prep.preparatedDrink(pina);
		
	}

}
