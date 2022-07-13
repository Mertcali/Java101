package Artik_Yil_Programi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int artikYil;
		boolean kosul = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yýlý giriniz: ");
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
			System.out.println("" + artikYil + " Bir Artýk Yýldýr");
		}else {
			System.out.println("" +artikYil + " Bir Artýk Yýl Deðildir");
		}
		int i=1, j=1;
		while(i<3)
		{
		  do
		  {
		    System.out.print(j + ",");
		    j++;
		  }while(j<4);
		  i++;
		}

	}
	
	

}
