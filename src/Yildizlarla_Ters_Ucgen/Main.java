package Yildizlarla_Ters_Ucgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz :");
		int n = klavye.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = n; j > (n - i - 1); j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * (n - i) - 3); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
