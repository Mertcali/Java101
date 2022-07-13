package Kombinasyon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,r;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Küme eleman sayýsý : ");
		n = scanner.nextInt();
		System.out.print("Oluþturulacak farklý gruplarýn eleman sayýsý : ");
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
		
		System.out.println("N FAKTORÝYEL : " +totalN);
		System.out.println("R FAKTORÝYEL : " +totalR);
		System.out.println("N-R FAKTORÝYEL : " +total);
		System.out.println("KOMBÝNASYON :  " +kombinasyon);
	}

}
