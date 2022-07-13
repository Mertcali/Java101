package EBOB_EKOK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi1 = 0, 
				sayi2 = 0, 
				buyukSayi, 
				bolen = 1,
				ebob = 1, 
				ekok = 1;

		System.out.print("Sayi 1 : ");
		sayi1 = scanner.nextInt();

		System.out.print("Sayi 2 : ");
		sayi2 = scanner.nextInt();

		if (sayi1 > sayi2)
			buyukSayi = sayi1;
		else
			buyukSayi = sayi2;

		while (bolen < buyukSayi) {
			if ((sayi1 % bolen == 0) && (sayi2 % bolen == 0))
				ebob = bolen;
			bolen++;
		}

		ekok = (sayi1 * sayi2) / ebob;
		System.out.print("Ebob : " + ebob + "\nEkok : " + ekok);

	}

}
