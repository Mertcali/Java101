package Dizi_Max_Min;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		int[] list = { 56, 34, 1, 8, 101, -2, -33 };

		int min = list[0];
		int max = list[0];
		
		System.out.println("Liste: "+Arrays.toString(list));
		Arrays.sort(list);
		System.out.println("Sýralanmýþ dizi: " +Arrays.toString(list));
		System.out.print("Bir Sayi Giriniz: ");
		int sayi = scanner.nextInt();


		for (int i : list) {
			if (i < sayi) {
				min = i;
			}
			if (i > sayi) {
				max = i;
				break;
			}
		}

		System.out.println("Girilen Sayý : "+sayi);
		System.out.println("Girilen sayýdan küçük en yakýn sayý : " + min);
		System.out.println("Girilen sayýdan büyük en yakýn sayý : " + max);

	}

}
