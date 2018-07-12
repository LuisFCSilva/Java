package Repetition;

import java.util.Scanner;

public class ApplicationFor {

	public static void main(String[] args) {

			
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Tabuada do número ");
		int tabuada = scan.nextInt();	
		
		for(int i = 1; i <= 10; i++) {
			
			var result = tabuada * i;
			System.out.println(tabuada + " X " + i + " = " + result);
		}
		
		scan.close();
		
		
	}

}
