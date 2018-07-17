package ClassObjects;

public class People {
	
	String name;
	int numberOfPics;
	
	
	void receiver(int numberOfPics) {
		this.numberOfPics += numberOfPics;
	}

	void delivered(int numberOfPics, People p) {
		if(this.numberOfPics >= numberOfPics) {
			this.numberOfPics -= numberOfPics;
			p.receiver(numberOfPics);
		} else {
			System.out.println("Without pics");
		}
	}
	
	int totalPics() {
		return this.numberOfPics;
	}
	
}
