package Sinifi_Gecme_Durumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat,fizik,turkce,kimya,muzik,sum=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik notu : ");
		mat = scanner.nextInt();
		
		System.out.println("Fizik notu : ");
		fizik = scanner.nextInt();
		
		System.out.println("T�rk�e notu : ");
		turkce = scanner.nextInt();
		
		System.out.println("Kimya notu : ");
		kimya = scanner.nextInt();
		
		System.out.println("M�zik notu : ");
		muzik = scanner.nextInt();
		
		if((mat<0 || mat >100)) {
			mat=0;
		}
		if((fizik<0 || fizik >100)) {
			fizik=0;
		}
		if((turkce<0 || turkce >100)) {
			turkce=0;
		}
		if((kimya<0 || kimya >100)) {
			kimya=0;
		}
		if((muzik<0 || muzik >100)) {
			muzik=0;
		}
		
		double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
		if(ortalama>=55) {
			System.out.println("Ge�tiniz. Ortalaman�z : " +ortalama);
		}else {
			System.out.println("Kald�n�z. Ortalaman�z :  " + ortalama);
		}
		
		/*
		List<Integer> dersNotlari = new ArrayList<Integer>();
		
		if(!(mat<0 || mat >100)) {
			dersNotlari.add(mat);
		}
		if(!(fizik<0 || fizik >100)) {
			dersNotlari.add(fizik);
		}
		if(!(turkce<0 || turkce >100)) {
			dersNotlari.add(turkce);
		}
		if(!(kimya<0 || kimya >100)) {
			dersNotlari.add(kimya);
		}
		if(!(muzik<0 || muzik >100)) {
			dersNotlari.add(muzik);
		}
		
		for(int i=0; i<dersNotlari.size();i++) {
			sum = sum + (dersNotlari.get(i));
		}
		
		double ortalama = sum / dersNotlari.size();
		System.out.println("Ge�erli Ders Notu Sayisi : " +dersNotlari.size());
		if(ortalama>=55) {
			System.out.println("Ge�tiniz. Ortalaman�z : " +ortalama);
		}else {
			System.out.println("Kald�n�z. " + ortalama);
		}
		-->Bu k�s�mda e�er bir not belirlenen aral�ktan ba�ka bir de�erdeyse 
		ders say�s�ndan da eksilterek ortalamay� hesaplatmak istedim. �rne�in matematik notu 10000 ise art�k 5 de�il ortalama
		4 ders �zerinden hesaplanacak.
		*/ 

	}

}
