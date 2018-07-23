package Herança;

public class Application {
	
	public static void main(String[] args) {
		
		Vehycle v = new Vehycle();
		
		v.setMark("Ferrari");
		v.setModel("F40");
		v.setYear(1999);
		
		v.showData();
		
		v.buzinar();
		
		Car celta = new Car();
		celta.setFourDoors(false);
		celta.setMark("GM");
		celta.setModel("Celta");
		celta.setYear(2008);
		celta.buzinar();
		celta.showData();
		
		/*Scania sc = new Scania();
		sc.buzinar();
		
		Motocicle moto = new Motocicle();
		moto.buzinar();*/
		
	}

}
