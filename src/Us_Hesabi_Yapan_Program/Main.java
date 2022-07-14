package Us_Hesabi_Yapan_Program;

import java.util.Scanner;

public class Main {

	static int result = 1;

	static int us(int x, int y) {
		if (x == 0) {
			return 1;
		}

		result *= y;
		us(x - 1, y);
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;

		System.out.print("Tabandaki sayiyi giriniz: ");
		y = input.nextInt();
		System.out.print("Usteki sayiyi giriniz: ");
		x = input.nextInt();

		System.out.println(us(x, y));
	}
}
