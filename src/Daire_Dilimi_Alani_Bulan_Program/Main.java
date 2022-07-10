package Daire_Dilimi_Alani_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double r,a;
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yarýçap Deðerini Giriniz : ");
		r = scanner.nextDouble();
		
		System.out.print("Açý Deðerini Giriniz : ");
		a = scanner.nextDouble();
		
		double alan = pi * r * r;
		double cevre = 2 * pi * r ;
		double dilimAlan = (pi * (r * r) * a) / 360;
		
		System.out.println("Dairenin Alaný : " + alan);
		System.out.println("Dairenin Çevresi : " + cevre);
		System.out.println("Daire Diliminin Alaný : " + dilimAlan);

	}

}
