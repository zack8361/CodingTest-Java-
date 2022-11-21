package BAEKJOON재귀;

import java.util.Scanner;

public class Algorithmfactorial02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int N =sc.nextInt();
        int sx = 1;
        for(int i=1; i<=N; i++){
            sx *= i;
        }
        System.out.println(sx);
    }
}
