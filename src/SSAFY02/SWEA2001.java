package SSAFY02;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SWEA2001 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int testcase = kong.nextInt();

        for(int i=0; i<testcase; i++){
            int n = kong.nextInt();
            for(int j=0; j<n; j++){
                int[][] Array = new int[n][n];
                Array[n][n] = 1;
            }
        }

    }
}
