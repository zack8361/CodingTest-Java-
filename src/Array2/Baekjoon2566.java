package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2566 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = arr[0][0];
        int x =0;
        int y =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = kong.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;

                }
            }
        }
        kong.close();
        System.out.println(max);
        System.out.println(x + "," + y);
    }
}
