package Kucukten_Buyuge_Sayi_Siralama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Sayi : ");
		a = scanner.nextInt();
		
		System.out.print("2. Sayi : ");
		b = scanner.nextInt();
		
		System.out.print("3. Sayi : ");
		c = scanner.nextInt();
		
		if((a<b) && (a<c)) {
			if(b<c) {
				System.out.println(""+a+"<"+b+"<"+c);
			}else {
				System.out.println(""+a+"<"+c+"<"+b);
			}
		}else if((b<a) && (b<c)) {
			if(a<c) {
				System.out.println(""+b+"<"+a+"<"+c);
			}else {
				System.out.println(""+b+"<"+c+"<"+a);
			}
		}else {
			if(a<b) {
				System.out.println(""+c+"<"+a+"<"+b);
			}else {
				System.out.println(""+c+"<"+b+"<"+a);
			}
		}

		
		
	}

}
