package Mukemmel_Sayi;

import java.util.Scanner;

public class Mukemmel_Sayi {

	public static void main(String[] args) {

		int sayi, toplam = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayý giriniz: ");
		sayi = scanner.nextInt();

		for (int i = sayi - 1; i >= 1; i--) {

			if (sayi % i == 0) {
				toplam += i;
			}

		}

		if (toplam == sayi) {

			System.out.println("Sayinizi mukemmel sayidir.");
		} else {
			System.out.println("Sayi mukemmel degildir.");

		}

	}

}
