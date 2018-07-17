package Overload;

public class Mathematic {
	
	int sum(int x, int y) {
		return x + y;
	}
	
	int sum(int x, int y, int z) {
		return x + y + z;
	}
	
	int sum (int x, double y) {
		return (int) (x + y);
	}
	

}
