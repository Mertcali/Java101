package Girilen_Sayiya_Kadar_Mod;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int girilenSayi, ortalama, bolen = -1, toplam = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Bir Sayi Giriniz: ");
		girilenSayi = scanner.nextInt();
		
		for(int i = 0;i<=girilenSayi;i++) {
			if(i%3==0 && i%4==0) {
				bolen++;
				toplam +=i;
			}
		}
		
		ortalama = toplam / bolen;
		System.out.println("Sayilarin Toplami : " +toplam);
		System.out.println("Kaç Tane Sayi Var : " +bolen);
		System.out.println("Sayilarin Ortalamasi : " +ortalama);

	}

}
