package Polimorphism;

public class Cat extends Animal {
	
	@Override
	public void speak() {
		System.out.println("Miau");
	}
	
	public void arranhar() {
		System.out.println("Vrau");
	}

}
