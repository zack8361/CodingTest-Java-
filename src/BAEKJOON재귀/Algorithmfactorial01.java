package BAEKJOON재귀;

import java.util.Scanner;

public class Algorithmfactorial01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요!");
        int N = sc.nextInt();
        System.out.println(factorial(N));

    }

    private static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}