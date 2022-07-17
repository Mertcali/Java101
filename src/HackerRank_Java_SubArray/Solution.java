package HackerRank_Java_SubArray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] arr = new int[length];

    int first = sc.nextInt();
    arr[0] = first;
    int count = first < 0 ? 1 : 0;

    for (int i = 1; i < length; i++){
        int num = sc.nextInt();
        arr[i] = arr[i - 1] + num;

        if (arr[i] < 0){
            count++;
        }

        for (int j = 0; j < i; j++){
            int sub_result = arr[i] - arr[j];
            if (sub_result < 0){
                count++;
            }
        }
    }

    System.out.print(count);
    }
}