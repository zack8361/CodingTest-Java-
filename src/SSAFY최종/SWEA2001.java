package SSAFY최종;

import java.util.Scanner;

//파리 퇴치
public class SWEA2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc<=T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] A = new int[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    A[i][j] =sc.nextInt();
                }
            }
            int max = 0;
            for(int i=0; i<N-M+1; i++){
                for(int j=0; j<N-M+1; j++){
                    int sum = 0;
                    for(int a=0; a<M; a++){
                        for(int b=0; b<M; b++){
                            sum += A[a+i][b+j];
                        }
                    }
                    max = Math.max(max,sum);
                }
            }
            System.out.println(max);


        }
    }
}
