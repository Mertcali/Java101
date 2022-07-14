package Girilen_Sayilardan_Min_Max_Bulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		int sayi;
		
		int enBuyukSayi = 0;
		int enKucukSayi = Integer.MAX_VALUE;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç tane sayi gireceksiniz: ");
		n = scanner.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.print(i + ". sayiyi giriniz : ");
			sayi = scanner.nextInt();
			
			if(n == 1) {
				enKucukSayi = sayi;
				enBuyukSayi = sayi;
			}else if(sayi>enBuyukSayi) {		
				enBuyukSayi = sayi;
			}else if(sayi<enKucukSayi) {
				enKucukSayi = sayi;
			}
			
			
		}
		
		System.out.println("En Büyük Sayi : " +enBuyukSayi);
		System.out.println("En Küçük Sayi : " +enKucukSayi);

	}

}
