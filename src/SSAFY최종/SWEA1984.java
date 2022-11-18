package SSAFY최종;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int[] A = new int[10];

            int max =0;
            int min =0;
            int sum=0;
            for(int i=0; i<A.length; i++){
                A[i] = sc.nextInt();
                sum+=A[i];
            }
            Arrays.sort(A);
            max = A[A.length-1];
            min = A[0];
            int result = sum - (min+max);
            int total = result/8;
            System.out.printf("%.2f",total);
        }
    }
}
