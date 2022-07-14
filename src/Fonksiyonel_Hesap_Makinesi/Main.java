package Fonksiyonel_Hesap_Makinesi;

import java.util.Scanner;

public class Main {

	static void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Modunu almak istediðiniz sayý : ");
		int number = scan.nextInt();

		System.out.print("Mod : ");
		int mod = scan.nextInt();

		int result = number % mod;
		System.out.println("Sonuç : " + result);

	}

	static void dikdortgenAlan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dikdörtgenin kýsa kenarý : ");
		int kisaKenar = scan.nextInt();

		System.out.print("Dikdörtgenin uzun kenarý : ");
		int uzunKenar = scan.nextInt();

		int dikdortgenAlan = kisaKenar * uzunKenar;
		System.out.println("Dikdörtgenin alaný: " +dikdortgenAlan);
	}

	static void dikdortgenCevre() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dikdörtgenin kýsa kenarý : ");
		int kisaKenar = scan.nextInt();

		System.out.print("Dikdörtgenin uzun kenarý : ");
		int uzunKenar = scan.nextInt();

		int dikdortgenCevre = 2 * (kisaKenar + uzunKenar);
		System.out.println("Dikdörtgenin çevresi: " +dikdortgenCevre);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Mod Alma Ýþlemi\n" + "2- Dikdörtgen Alan Bulma Ýþlemi\n"
				+ "3- Dikdörtgen Çevre Bulma Ýþlemi\n";

		do {
			System.out.println(menu);
			System.out.print("Lütfen bir iþlem seçiniz :");
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
				System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
			}
		} while (select != 0);

	}

}
