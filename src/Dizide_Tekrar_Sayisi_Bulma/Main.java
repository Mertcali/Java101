package Dizide_Tekrar_Sayisi_Bulma;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int dizi[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int sayac[] = new int[dizi.length];

		for (int i = 0; i < dizi.length; i++) {
			sayac[i] = 1;
		}

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if ((i != j) && (dizi[i] == dizi[j])) {
					sayac[i]++;
				}
			}
		}
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if ((i != j) && (dizi[i] == dizi[j])) {

					dizi[i]=0;

					break;
				}
			}
		}
		
		System.out.println("Listenin son hali : " +Arrays.toString(dizi));
		for(int i =0; i<dizi.length;i++) {
			if(sayac[i]>=1 && dizi[i] !=0) {
				System.out.println(dizi[i] + " sayýsý " + sayac[i] + " kere tekrar edildi.");
			}
		}
	}

}
