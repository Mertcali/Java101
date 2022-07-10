package Kullanici_Girisi;

import java.io.Console;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, newPassword,
		sifreSifirlama;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kullanýcý Adýnýz : ");
		userName = scanner.nextLine();
		
		System.out.print("Þifreniz : ");
		password = scanner.nextLine();
		
		if(userName.equals("m")) {
			if(password.equals("12")) {
				System.out.println("Giriþ Baþarýlý");
			}else {
				System.out.println("Þifre Yanlýþ. Deðiþtirmek Ýçin y, Çýkýþ Ýçin n");
				sifreSifirlama = scanner.nextLine();
				if(sifreSifirlama.equals("n")) System.out.println("Çýkýþ Yapýldý.");
				if(sifreSifirlama.equals("y")) {
					System.out.println("Yeni Þifreniz: ");
					newPassword = scanner.nextLine();	
					if(newPassword.equals("12") || newPassword.equals(password)) {
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
					}else {
						System.out.println("Þifre baþarýyla oluþturuldu.");
						password = newPassword;
					}
				}
				
			}
		}else {
			System.out.println("Kullanýcý Mevcut Deðil");
		}
		
	}
}
