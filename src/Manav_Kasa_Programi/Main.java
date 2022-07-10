package Manav_Kasa_Programi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armutPricePerKg = 2.14, elmaPricePerKg = 3.67, 
				domatesPricePerKg = 1.11, muzPricePerKg = 0.95, patlicanPricePerKg = 5;
		
		double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? : ");
		armutKg = scanner.nextDouble();
		
		System.out.print("Elma Kaç Kilo ? : ");
		elmaKg = scanner.nextDouble();
		
		System.out.print("Domates Kaç Kilo ? : ");
		domatesKg = scanner.nextDouble();
		
		System.out.print("Muz Kaç Kilo ? : ");
		muzKg = scanner.nextDouble();
		
		System.out.print("Patlýcan Kaç Kilo ? : ");
		patlicanKg = scanner.nextDouble();
		
		double tutar = (armutKg * armutPricePerKg) + (elmaKg * elmaPricePerKg)
				+ (domatesKg * domatesPricePerKg) + (muzKg * muzPricePerKg) + (patlicanKg * patlicanPricePerKg);
		
		System.out.println("Toplam Tutar : " + tutar);

	}

}
