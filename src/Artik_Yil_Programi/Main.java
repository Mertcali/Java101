package Artik_Yil_Programi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int artikYil;
		boolean kosul = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Y�l� giriniz: ");
		artikYil = scanner.nextInt();
		
		if(artikYil%4==0) {
			if(artikYil % 100 == 0) {
				if(artikYil % 400 == 0) {
					kosul = true;
				}else {
					kosul = false;
				}
			}else {
				kosul=true;
			}
		}else {
			kosul=false;
		}
		
		if(kosul) {
			System.out.println("" + artikYil + " Bir Art�k Y�ld�r");
		}else {
			System.out.println("" +artikYil + " Bir Art�k Y�l De�ildir");
		}
	
	}

}
