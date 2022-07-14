package Asal_Sayilari_Yazdiran_Program;

public class Main {

	public static void main(String[] args) {

		String asalSayilar = "";
		for (int i = 1; i <= 100; i++) {
			int sayac = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					sayac++;
				}
			}
			if (sayac == 2) {
				asalSayilar = asalSayilar + i + " ";
			}
		}
		System.out.println(asalSayilar);
	}

}
