package SSAFY02;

import java.util.Scanner;

public class SWEA1983 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);

        int testcase = kong.nextInt();
        for(int i=0; i<testcase; i++){
            int num = kong.nextInt();
            int[][] arr = new int[num][num];
            int num2 = kong.nextInt();
            for(int a=0; a<arr.length; a++){
                for(int b=0; b<arr.length; b++){
                    arr[a][b] = kong.nextInt();
                }
            }


        }
    }
}
