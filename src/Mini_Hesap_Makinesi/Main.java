package Mini_Hesap_Makinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n1,n2,select;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ýlk Sayýyý Giriniz : ");
		n1 = scanner.nextInt();
		System.out.print("Ýlk Sayýyý Giriniz : ");
		n2 = scanner.nextInt();
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz : ");
		select = scanner.nextInt();
		
		switch (select) {
		case 1: {
			System.out.println("Toplam : " + (n1 + n2));
			break;
			
		}
		case 2:{
			System.out.println("Çýkarma : " +(n1 - n2));
			break;
		}
		case 3:{
			System.out.println("Çarpma : " + (n1 * n2));
			break;
		}
		case 4:{
			System.out.println("Bölme : " + (n1 / n2));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		}
		
		

	}

}
