package Girilen_Sayidan_Kucuk_Kuvvetleri_Bulma;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sýnýr sayýsý : ");
		sayi = scanner.nextInt();
		
		/* ----------------------------------4'ün Kuvvetleri ----------------------------------*/
		
		for(int i =1;i<=sayi;i*=4) {
			System.out.println(i);
		}
		
		/* ----------------------------------5'in Kuvvetleri ----------------------------------*/

		for(int i = 1; i<=sayi;i*=5) {
			System.out.println(i);
		}
	}

}
