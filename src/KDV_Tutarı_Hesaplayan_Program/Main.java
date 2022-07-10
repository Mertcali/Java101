package KDV_Tutarý_Hesaplayan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double tutar = 0;
		double kdvOran = 0;
				
		Scanner input = new Scanner(System.in);
		System.out.print("Ücreti Giriniz : ");
		tutar = input.nextDouble();
		
		if(tutar>0 && tutar<=1000) {
			 kdvOran = 0.18;
		}else if(tutar>1000) {
			 kdvOran = 0.08;
		}else {
			System.out.println("TUTAR NEGATÝF GÝRÝLDÝ");
		}
		
		double kdvTutar = tutar * kdvOran;
		double kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDVSÝZ TUTAR : " + tutar);
		System.out.println("KDV ORANI : " + kdvOran);
		System.out.println("KDV TUTARI : " + kdvTutar );
		System.out.println("KDVLÝ TUTAR : " + kdvliTutar);

	}

}
