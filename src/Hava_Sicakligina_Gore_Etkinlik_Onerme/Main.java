package Hava_Sicakligina_Gore_Etkinlik_Onerme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int temp;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("S�cakl�k : ");
		temp = scanner.nextInt();
		
		if(temp<=5)System.out.println("Kayak yapabilirsin.");
		if(temp>5 && temp<=15)System.out.println("Sinemaya gidebilirsin.");
		if(temp>15 && temp<=25)System.out.println("Pikni�e gidebilirsin.");
		else System.out.println("Y�zmeye gidebilirsin.");
		

	}

}
