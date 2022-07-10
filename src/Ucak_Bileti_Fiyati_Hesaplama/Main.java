package Ucak_Bileti_Fiyati_Hesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int age,km,tripType;
		double yasIndirimi = 0,ucusIndirimi=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mesafeyi km t�r�nden giriniz : ");
		km = scanner.nextInt();
	
		System.out.print("Ya��n�z� giriniz : ");
		age = scanner.nextInt();	

		System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ):");
		tripType = scanner.nextInt();	


		double tutar = km * 0.10;
		
		if(age<12) {
			yasIndirimi = tutar * (0.50);
		}else if(age>=12 && age<=24) {
			yasIndirimi = tutar * (0.10);
		}else if(age>65) {
			yasIndirimi = tutar * (0.30);
		}else {
			System.out.println("Ya� �ndirimi Mevcut De�il");
		}
		
		tutar -= yasIndirimi;
		
		if(tripType==2) {
			ucusIndirimi = tutar * 0.20;
			tutar -= ucusIndirimi;
			tutar *=2;
		}
		
		
		if(km<=0 || age<0 || !(tripType==1 || tripType ==2)) {
			System.out.println("Hatal� Veri Girdiniz !");
		}else {
			System.out.println("Ya� indirim tutar�: " +yasIndirimi);
			System.out.println("U�u� Tipi indirim tutar� : " +ucusIndirimi);
			System.out.println("Fiyat: " +tutar);
		}
		
	}

}
