package Vucut_Kitle_Indeksi_Hesaplayan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy,kilo;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen boyunuzu (metre cinsinden) giriniz : ");
		boy = scanner.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo = scanner.nextDouble();
		
		double indeks = kilo / (boy * boy);
		System.out.println("V�cut Kitle �ndeksiniz : " +indeks);

	}

}
