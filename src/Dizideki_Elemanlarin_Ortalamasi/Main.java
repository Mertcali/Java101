package Dizideki_Elemanlarin_Ortalamasi;

public class Main {

	public static void main(String[] args) {
		
		 int[] numbers = {1, 2, 3, 4, 5};
			double result = 0;		
			for(double i = 1;i<=numbers.length;i++) {		
				result +=(1/i);			
			}

	        System.out.println(numbers.length / result);
	}

}
