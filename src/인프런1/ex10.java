package 인프런1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+2][N+2];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("  ");
        for(int i=0; i<=N+1; i++){
            for(int j=0; j<=N+1; j++) {
                arr[i][0] = 0;
                arr[0][j] = 0;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int count = 0;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
