package Donguler_Ile_Tek_Sayi_Toplami_Bulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi,total = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Sayi giriniz : ");
			sayi = scanner.nextInt();
			if(sayi%2==0 && sayi%4==0) {
				total+=sayi;
			}
			
			
		} while (sayi%2==0);

		System.out.println("Toplam : " +total);
	}

}
