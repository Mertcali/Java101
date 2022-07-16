package Kullanicidan_Alinan_Diziyi_Sirala;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dizi boyutu n: ");
		int n = scanner.nextInt();
		
		int[] dizi = new int[n];
		
		System.out.println("Dizinin elemanlarýný giriniz :");
		for(int i = 0; i<n; i++) {
			System.out.print((i+1) +". Eleman : ");
			dizi[i] = scanner.nextInt();
		}

		Arrays.sort(dizi);
		System.out.println(Arrays.toString(dizi));
		
	}

}
