package BAEKJOON정렬;

import java.util.Scanner;

public class BaekJoon2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][N];
        int[][] B = new int[M][M];
        int[][] result = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<M; i++){
            for(int j=0; j<M; j++){
                B[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                result[i][j] = A[i][j] + B[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
