package Not_Ortalamas�_Hesaplayan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		int mat,fizik,kimya,turkce,tarih;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz: ");
		mat= inp.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik= inp.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya= inp.nextInt();
		
		System.out.print("T�rk�e Notunuz: ");
		turkce= inp.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih= inp.nextInt();
		
		double ortalama = (mat + fizik + kimya + turkce + tarih) / 5;
		System.out.println("Ortalaman�z : " + ortalama);
		
		boolean checkOrtalama = ortalama >=60;
		String gectiMi = checkOrtalama ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
		System.out.println(gectiMi);

	}

}
