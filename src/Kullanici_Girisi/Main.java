package Kullanici_Girisi;

import java.io.Console;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, newPassword,
		sifreSifirlama;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kullan�c� Ad�n�z : ");
		userName = scanner.nextLine();
		
		System.out.print("�ifreniz : ");
		password = scanner.nextLine();
		
		if(userName.equals("m")) {
			if(password.equals("12")) {
				System.out.println("Giri� Ba�ar�l�");
			}else {
				System.out.println("�ifre Yanl��. De�i�tirmek ��in y, ��k�� ��in n");
				sifreSifirlama = scanner.nextLine();
				if(sifreSifirlama.equals("n")) System.out.println("��k�� Yap�ld�.");
				if(sifreSifirlama.equals("y")) {
					System.out.println("Yeni �ifreniz: ");
					newPassword = scanner.nextLine();	
					if(newPassword.equals("12") || newPassword.equals(password)) {
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					}else {
						System.out.println("�ifre ba�ar�yla olu�turuldu.");
						password = newPassword;
					}
				}
				
			}
		}else {
			System.out.println("Kullan�c� Mevcut De�il");
		}
		
	}
}
