package Daire_Dilimi_Alani_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double r,a;
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yar��ap De�erini Giriniz : ");
		r = scanner.nextDouble();
		
		System.out.print("A�� De�erini Giriniz : ");
		a = scanner.nextDouble();
		
		double alan = pi * r * r;
		double cevre = 2 * pi * r ;
		double dilimAlan = (pi * (r * r) * a) / 360;
		
		System.out.println("Dairenin Alan� : " + alan);
		System.out.println("Dairenin �evresi : " + cevre);
		System.out.println("Daire Diliminin Alan� : " + dilimAlan);

	}

}
