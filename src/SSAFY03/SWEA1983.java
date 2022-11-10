package SSAFY03;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr;
        for(int tc=0; tc<N; tc++){
            int num = sc.nextInt();
            int num2 = sc.nextInt();

            for(int i=0; i<num; i++){
                arr = new int[3];

                int sum = 0;
                for(int j=0; j<arr.length; j++){
                    arr[j] = sc.nextInt();
                    sum+= arr[j];
                }
                int[] arr2 = new int[sum];
                Arrays.sort(arr2);
                System.out.println(sum);
            }

        }
    }
}
