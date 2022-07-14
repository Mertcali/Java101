package Palindromik_Sayilar;

public class Main {

	
	static boolean isPalindrom(int number) {
		
		int tempNumber = number;
		int reverseNumber =0;
		int lastNumber;
		
		while(tempNumber!=0) {
			System.out.println("**********");
			System.out.println("Number -> " + tempNumber);
			lastNumber=tempNumber%10;
			System.out.println("Son Basamak -> " +lastNumber);
			reverseNumber = (reverseNumber*10) +lastNumber;
			System.out.println("Yeni Sayi -> " +reverseNumber);
			tempNumber /= 10;
			System.out.println("Yeni Temp -> " +tempNumber);
		}
		if(number == reverseNumber) {
			System.out.println("Sayi Palindromik ");
			return true;		
		}else {
			System.out.println("Sayi Palindromik Değil ");
			return false;
		}
			
		
		
	}
	
	public static void main(String[] args) {
			isPalindrom(2157);
	}

}
