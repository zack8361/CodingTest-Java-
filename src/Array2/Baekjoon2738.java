package Array2;

import java.util.Scanner;


public class Baekjoon2738 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int [][] result = new int[3][3];

        int num = kong.nextInt();
        int num2 = kong.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num2; j++){
                arr[i][j] = kong.nextInt();
            }
        }
        for(int i=0; i<num; i++){
            for(int j=0; j<num2; j++){
                arr2[i][j] = kong.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                result[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        kong.close();
    }
}
