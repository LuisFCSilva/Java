package Polimorphism;

public class Application {

	public static void main(String[] args) {
		
			Animal d = new Dog();
			d.speak();
			
			Animal c = new Cat();

			if(c instanceof Cat) {
				Cat ca = (Cat) c;
				ca.arranhar();
			}
	}

}
