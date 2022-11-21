package BAEKJOON재귀;

import java.util.Scanner;

public class BAEKJOON10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Pib(N));
    }

    private static int Pib(int n) {
        if(n<=1){
            return n;
        }
        else {
            return Pib(n-2)+Pib(n-1);
        }
    }
}
