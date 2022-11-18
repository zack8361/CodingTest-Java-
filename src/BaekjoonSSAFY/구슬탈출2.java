package BaekjoonSSAFY;

import java.util.Scanner;

public class 구슬탈출2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];

        for(int i=0; i<N; i++){
            String s = sc.next();
            for(int j=0; j<M; j++){
                A[i][j] = s.charAt(j);

            }
        }
        int x = 0;
        int y =0;
        int dir =0;


    }
}
