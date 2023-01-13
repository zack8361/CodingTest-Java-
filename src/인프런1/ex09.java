package 인프런1;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int sum = 0;
        int sum2 = 0;
        for(int i=0; i<N; i++){
            sum =0;
            sum2 = 0;
            for(int j=0; j<N; j++){
                sum +=arr[i][j];
                sum2 +=arr[j][i];
            }
            max = Math.max(max,sum);
            max = Math.max(max,sum2);
        }
        int sum3 = arr[0][0];
        for(int i=0; i<N-1; i++){
            sum3+=arr[i+1][i+1];
        }
        max = Math.max(max,sum3);
        int sum4 = arr[N][0];

        for(int i=N; i>0; i--){
            sum4+=arr[i-1][i-1];
        }

    }
}
