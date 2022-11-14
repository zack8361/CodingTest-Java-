package SSAFY03;

import java.util.Scanner;

public class SWEA1970re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coin = {50000,10000,5000,1000,500,100,50,10};
        int T = sc.nextInt();

        for(int tc = 1; tc<=T; tc++){
            int money = sc.nextInt();
            System.out.println("#" + tc);
            for(int i=0; i<coin.length; i++){
                System.out.print(money/coin[i] + " ");
                money %= coin[i];
            }
            System.out.println();
        }
    }
}
