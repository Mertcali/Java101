package Burc_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//��S�ZL�K SANATI
		
		int month,day;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do�um ay� : ");
		month=scanner.nextInt();
		System.out.println("Do�um g�n� : ");
		day = scanner.nextInt();
		
		if(month==1) {
			if(day<22) {
				System.out.println("Burcunuz : O�lak");
			}else {
				System.out.println("Burcunuz : Kova");
			}
		}
		
		if(month==2) {
			if(day<20) {
				System.out.println("Burcunuz : Kova");
			}else {
				System.out.println("Burcunuz : Bal�k");
			}
		}
		
		if(month == 3) {
			if(day<21) {
				System.out.println("Burcunuz : Bal�k");
			}else {
				System.out.println("Burcunuz : Ko� ");
			}
		}
		if(month == 4) {
			if(day<21) {
				System.out.println("Burcunuz : Ko�");
			}else {
				System.out.println("Burcunuz : Bo�a");
			}
		}
		
		if(month==5) {
			if(day<22) {
				System.out.println("Burcunuz : Bo�a");
			}else {
				System.out.println("Burcunuz : �kizler");
			}
		}
		
		if(month==6) {
			if(day<23) {
				System.out.println("Burcunuz : �kizler");
			}else {
				System.out.println("Burcunuz : Yenge�");
			}
		}
		
		if(month == 7) {
			if(day<23) {
				System.out.println("Burcunuz : Yenge�");
			}else {
				System.out.println("Burcunuz : Aslan");
			}
		}
		
		if(month == 8) {
			if(day<23) {
				System.out.println("Burcunuz: Aslan");
			}else {
				System.out.println("Burcunuz : Ba�ak ");
			}
		}
		
		if(month==9) {
			if(day<23) {
				System.out.println("Burcunuz : Ba�ak");
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
				System.out.println("Burcunuz : O�lak");
			}
		}
		
	}

}
