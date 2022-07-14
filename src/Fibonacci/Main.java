package Fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int elemanSayisi;
		int n1 = 0, n2=1,n3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Seri kaç elemanlý olsun? : ");
		elemanSayisi = scanner.nextInt();
		
		System.out.print(n1 + " " +n2);
		
		for(int i=2;i<elemanSayisi;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}

}
