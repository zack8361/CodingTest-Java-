package SSAFY02;

import java.util.Scanner;

public class SWEA1961 {
        public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int t = kong.nextInt();
        for(int tc=1; tc<t; tc++){
            int n = kong.nextInt();
            int[][] arr = new int[n][n];

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++){
                    arr[i][j] = kong.nextInt();
                }
            }

            int[][] result_90 = Rotation(arr);
            int[][] result_180 = Rotation(result_90);
            int[][] result_270 = Rotation(result_180);

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++) {
                    System.out.print(result_90[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<arr.length;j++){
                    System.out.print(result_180[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<arr.length;j++){
                    System.out.print(result_270[i][j]);
                }


                System.out.println();
            }
        }
    }
    public static int[][] Rotation(int[][] arr){
        int[][] result = new int[arr.length][arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                result[i][j] = arr[arr.length-j-1][i];
            }
        }
        return result;
    }
}