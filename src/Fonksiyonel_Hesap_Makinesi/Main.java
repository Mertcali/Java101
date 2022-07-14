package Fonksiyonel_Hesap_Makinesi;

import java.util.Scanner;

public class Main {

	static void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Modunu almak istedi�iniz say� : ");
		int number = scan.nextInt();

		System.out.print("Mod : ");
		int mod = scan.nextInt();

		int result = number % mod;
		System.out.println("Sonu� : " + result);

	}

	static void dikdortgenAlan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dikd�rtgenin k�sa kenar� : ");
		int kisaKenar = scan.nextInt();

		System.out.print("Dikd�rtgenin uzun kenar� : ");
		int uzunKenar = scan.nextInt();

		int dikdortgenAlan = kisaKenar * uzunKenar;
		System.out.println("Dikd�rtgenin alan�: " +dikdortgenAlan);
	}

	static void dikdortgenCevre() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dikd�rtgenin k�sa kenar� : ");
		int kisaKenar = scan.nextInt();

		System.out.print("Dikd�rtgenin uzun kenar� : ");
		int uzunKenar = scan.nextInt();

		int dikdortgenCevre = 2 * (kisaKenar + uzunKenar);
		System.out.println("Dikd�rtgenin �evresi: " +dikdortgenCevre);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Mod Alma ��lemi\n" + "2- Dikd�rtgen Alan Bulma ��lemi\n"
				+ "3- Dikd�rtgen �evre Bulma ��lemi\n";

		do {
			System.out.println(menu);
			System.out.print("L�tfen bir i�lem se�iniz :");
			select = scan.nextInt();
			switch (select) {
			case 1:
				mod();
				break;
			case 2:
				dikdortgenAlan();
				break;
			case 3:
				dikdortgenCevre();
				break;
			default:
				System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
			}
		} while (select != 0);

	}

}
