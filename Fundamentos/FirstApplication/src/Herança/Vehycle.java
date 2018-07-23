package Herança;

public class Vehycle {
	
	private String mark;
	private String model;
	private int year;
	
	public void buzinar() {
		System.out.println("Fom fom");
	}
	
	public void showData() {
		System.out.println("Marca: " + mark);
		System.out.println("Modelo: " + model);
		System.out.println("Ano: " + year);
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
