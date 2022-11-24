package BAEKJOON재귀;

import java.util.Scanner;

public class bunsuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt =0;
        int n = 0;
        int sum = 0;
        while (N>cnt){
            n++;
            cnt =n*(n+1)/2;
            sum+=cnt;
        }
        System.out.println(cnt);
        System.out.println(n);
    }
}
