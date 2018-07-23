package Herança;

public class Car extends Vehycle {
	
	private boolean fourDoors;

	public boolean getFourDoors() {
		return fourDoors;
	}

	public void setFourDoors(boolean fourDoors) {
		this.fourDoors = fourDoors;
	}
	
	@Override
	public void showData() {
		String msg =  fourDoors == true? "Sim" : "Não";
		super.showData();
		System.out.println("4 portas? " + msg);
	}

}
