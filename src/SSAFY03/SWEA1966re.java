package SSAFY03;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1966re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            int num = sc.nextInt();
            int[] arr = new int[num];

            for(int j=0; j<arr.length; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("#" + i);
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[j]+ " ");
            }
        }
    }
}
