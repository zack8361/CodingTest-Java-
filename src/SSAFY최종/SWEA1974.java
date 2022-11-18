package SSAFY최종;

import java.util.Scanner;

public class SWEA1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[][] N = new int[9][9];

        for(int tc =1; tc<=T; tc++){

            for(int i=0; i<N.length; i++){
                for(int j=0; j<N.length; j++){
                    N[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<N.length; i++){
                int[] arr = new int[9];
                for(int j=0; j<N.length; j++){
                    arr[N[i][j]-1]++;
                }
                for(int j=0; j<N.length; j++){
                    System.out.print(arr[j]);
                }
                System.out.println();
            }

        }
    }
}
