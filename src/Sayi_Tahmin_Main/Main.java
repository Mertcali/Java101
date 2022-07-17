package Sayi_Tahmin_Main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasýnda bir deðer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalý giriþ yaptýnýz. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalý giriþinizde hakkýnýzdan düþülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doðru tahmin ! Tahmin ettiðini sayý : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalý bir sayý girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayýsý, gizli sayýdan büyüktür.");
                } else {
                    System.out.println(selected + " sayýsý, gizli sayýdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakký : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}