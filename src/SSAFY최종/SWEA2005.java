package SSAFY최종;

import java.util.Scanner;

//파스칼의 삼각형
//1.2차원 배열의 패턴을 파악해야함.
public class SWEA2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[][] A = new int[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){
                    if(j==i || j==0){
                        A[i][j] = 1;
                    }
                    else {
                        A[i][j] = A[i-1][j] + A[i-1][j-1];
                    }
                    System.out.print(A[i][j]);
                }
                System.out.println();

            }
        }
    }
}
