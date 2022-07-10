package Kenarlari_Bilinen_Ucgenin_Alanini_Hesaplayan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner input = new Scanner(System.in);
		System.out.print("1. Kenarý giriniz : ");
		a = input.nextInt();
		System.out.print("2. Kenarý giriniz : ");
		b = input.nextInt();
		System.out.print("3. Kenarý giriniz : ");
		c = input.nextInt();
		
		double u = (a+b+c) / 2 ;
		double cevre = 2 * u;
		
		double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		
		System.out.println("Üçgenin Çevresi : " + cevre);
		System.out.println("U Deðeri : " +u);
		System.out.println("Üçgenin Alaný : " + alan);

	}

}
