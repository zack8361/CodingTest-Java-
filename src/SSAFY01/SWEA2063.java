package SSAFY01;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);

    }
}
