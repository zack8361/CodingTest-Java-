package SSAFY02;

import java.util.Scanner;

public class SWEA1959 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int tc = kong.nextInt();

        for(int t=0; t<tc; t++){
            int N = kong.nextInt();
            int M = kong.nextInt();

            int[] A = new int[N];
            int[] B = new int[M];

            for(int i=0; i<A.length; i++){
                A[i] = kong.nextInt();
            }
            for(int i=0; i<B.length; i++){
                B[i] = kong.nextInt();
            }
            int max =0;
            for(int i=0; i< M-N+1; i++){ //여기 알고리즘 중요 하루에 한번씩 보기.
                int result = 0; //배열의 곱의 합을 저장할 껍데기.
                for(int j=0; j<N; j++){  //N과 M중 작은것에 넣어야함.
                    result += A[j] * B[i+j];
                }
                max = Math.max(max,result);
            }
            System.out.println(max);
        }

    }
}
