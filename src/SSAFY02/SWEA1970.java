package SSAFY02;

import java.util.Scanner;

public class SWEA1970 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);

        int[] coin = {50000,10000,5000,1000,500,100,50,10}; //먼저 배열로 돈의 단위를 설정
        int testcase = kong.nextInt();

        for(int i=0; i<testcase; i++){
            int money = kong.nextInt();

            for(int j=0; j<coin.length; j++){
                System.out.println(coin[j] + ":" + money/coin[j]);
                money %=coin[j];
            }

        }

    }
}
