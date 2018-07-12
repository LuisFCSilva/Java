package Repetition;

public class ApplicationWhile {
	
	public static void main(String[] args) {
		
		var number = 0;
		
		/*while (number <= 10) {
			System.out.println(number);
			number++;
		}*/
		
		while(number <= 10) {
			number++;
			
			if(number == 5) {
				continue;
			}
			
			System.out.println(number);
			
		}
		
	}

}
