package Kombinasyon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,r;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("K�me eleman say�s� : ");
		n = scanner.nextInt();
		System.out.print("Olu�turulacak farkl� gruplar�n eleman say�s� : ");
		r = scanner.nextInt();
		
		int total = 1;
		int totalN = 1;
		int totalR = 1;
		
		for(int i = 1;i<=n;i++) {
			totalN = totalN * i;
		}

		for(int j =1; j<=r;j++) {
			totalR = totalR * j;
		}
		
		for(int k =1; k<=(n-r);k++) {
			total = total * k;
		}
		
		int kombinasyon = totalN / (totalR * (total));
		
		System.out.println("N FAKTOR�YEL : " +totalN);
		System.out.println("R FAKTOR�YEL : " +totalR);
		System.out.println("N-R FAKTOR�YEL : " +total);
		System.out.println("KOMB�NASYON :  " +kombinasyon);
	}

}
