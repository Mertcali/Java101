package Burc_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//ÝÞSÝZLÝK SANATI
		
		int month,day;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doðum ayý : ");
		month=scanner.nextInt();
		System.out.println("Doðum günü : ");
		day = scanner.nextInt();
		
		if(month==1) {
			if(day<22) {
				System.out.println("Burcunuz : Oðlak");
			}else {
				System.out.println("Burcunuz : Kova");
			}
		}
		
		if(month==2) {
			if(day<20) {
				System.out.println("Burcunuz : Kova");
			}else {
				System.out.println("Burcunuz : Balýk");
			}
		}
		
		if(month == 3) {
			if(day<21) {
				System.out.println("Burcunuz : Balýk");
			}else {
				System.out.println("Burcunuz : Koç ");
			}
		}
		if(month == 4) {
			if(day<21) {
				System.out.println("Burcunuz : Koç");
			}else {
				System.out.println("Burcunuz : Boða");
			}
		}
		
		if(month==5) {
			if(day<22) {
				System.out.println("Burcunuz : Boða");
			}else {
				System.out.println("Burcunuz : Ýkizler");
			}
		}
		
		if(month==6) {
			if(day<23) {
				System.out.println("Burcunuz : Ýkizler");
			}else {
				System.out.println("Burcunuz : Yengeç");
			}
		}
		
		if(month == 7) {
			if(day<23) {
				System.out.println("Burcunuz : Yengeç");
			}else {
				System.out.println("Burcunuz : Aslan");
			}
		}
		
		if(month == 8) {
			if(day<23) {
				System.out.println("Burcunuz: Aslan");
			}else {
				System.out.println("Burcunuz : Baþak ");
			}
		}
		
		if(month==9) {
			if(day<23) {
				System.out.println("Burcunuz : Baþak");
			}else {
				System.out.println("Burcunuz : Terazi");
			}
		}
		if(month ==10) {
			if(day<23) {
				System.out.println("Burcunuz : Terazi");
			}else {
				System.out.println("Burcunuz : Akrep");
			}
		}
		
		if(month ==11) {
			if(day<22) {
				System.out.println("Burcunuz : Akrep");
			}else {
				System.out.println("Burcunuz : Yay");
			}
		}
		
		if(month ==12) {
			if(day<22) {
				System.out.println("Burcunuz : Yay");
			}else {
				System.out.println("Burcunuz : Oðlak");
			}
		}
		
	}

}
