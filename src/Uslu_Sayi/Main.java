package Uslu_Sayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi,us;
		int total = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ss� al�nacak say� : ");
		sayi = scanner.nextInt();
		System.out.print("�s : ");
		us = scanner.nextInt();
		
		for(int i = 1;i<=us;i++) {
			total *=sayi;
		}

		System.out.println("Sonu� : " +total);
	}

}
