package SSAFY03;

import java.util.Scanner;

public class SWEA2001re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int tc =0; tc<num; tc++){
            int N = sc.nextInt();
            int[][] A = new int[N][N];
            int M = sc.nextInt();

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    A[i][j] = sc.nextInt();
                }
            }

          int max =0;
            for(int i=0; i<N-M+1; i++){
                for(int j=0; j<N-M+1;j++){

                    int sum =0;
                    for(int a=0; a<M; a++){
                        for(int b=0; b<M; b++){
                            sum += A[i+a][j+b];
                        }
                    }
                    max = Math.max(max,sum);
                }
            }
            System.out.println(max);
        }
    }
}
