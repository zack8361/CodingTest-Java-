package 알고리즘4이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class BinEx1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        int[] B = new int[M];

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }
        for (int i=0; i<M; i++){
            System.out.println(binSearch(A,B[i]));
        }
    }

    private static int binSearch(int[] a, int n) {
        int start = 0;
        int end = a.length-1;
        int mid =0;
        while (start<=end){
            mid = (start+end)/2;
            for(int i=0; i<a.length; i++){
                if(a[mid] == n){
                    return 1;
                }
                else if(a[mid]<n){
                    start = mid +1;
                }
                else if(a[mid]>n){
                    end = mid -1;
                }
            }
        }
        return 0;
    }
}
