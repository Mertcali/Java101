package Ucak_Bileti_Fiyati_Hesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int age,km,tripType;
		double yasIndirimi = 0,ucusIndirimi=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		km = scanner.nextInt();
	
		System.out.print("Yaþýnýzý giriniz : ");
		age = scanner.nextInt();	

		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
		tripType = scanner.nextInt();	


		double tutar = km * 0.10;
		
		if(age<12) {
			yasIndirimi = tutar * (0.50);
		}else if(age>=12 && age<=24) {
			yasIndirimi = tutar * (0.10);
		}else if(age>65) {
			yasIndirimi = tutar * (0.30);
		}else {
			System.out.println("Yaþ Ýndirimi Mevcut Deðil");
		}
		
		tutar -= yasIndirimi;
		
		if(tripType==2) {
			ucusIndirimi = tutar * 0.20;
			tutar -= ucusIndirimi;
			tutar *=2;
		}
		
		
		if(km<=0 || age<0 || !(tripType==1 || tripType ==2)) {
			System.out.println("Hatalý Veri Girdiniz !");
		}else {
			System.out.println("Yaþ indirim tutarý: " +yasIndirimi);
			System.out.println("Uçuþ Tipi indirim tutarý : " +ucusIndirimi);
			System.out.println("Fiyat: " +tutar);
		}
		
	}

}
