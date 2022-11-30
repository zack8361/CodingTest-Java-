package 알고리즘4탐색;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoonex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //첫번째 배열 입력
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        int[] B = new int[M];
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }
        for(int i=0; i<M; i++){
            System.out.println(binSearch(A,B[i]));
        }
    }

    private static int binSearch(int[] a, int n){
        return 0;
    }
}
