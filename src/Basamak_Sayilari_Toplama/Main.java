package Basamak_Sayilari_Toplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
        System.out.print("Sayý Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
            
        }
        //System.out.println(basNumber);
        
        tempNumber = number;
        while(tempNumber !=0) {
        	basValue = tempNumber %10;
        	//System.out.println(basValue);
        	tempNumber /=10;
        	result +=basValue;
        	//System.out.println(tempNumber);
        }
        System.out.println("Basamak sayilarinin toplami : " +result);

	}

}
