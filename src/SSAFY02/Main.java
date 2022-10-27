package SSAFY02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();

        for(int i =0; i<num; i++){
            int num2 = kong.nextInt();
            int num3 = kong.nextInt();
            int[][] Array = new int[num2][num2];
            int max = 0;

            //배열 입력
            for(int j=0; j<num2;j++){
                for(int k=0; k<num2; k++){
                    Array[j][k] = (int)(Math.random()*10);
                }
            }

        }
    }
}