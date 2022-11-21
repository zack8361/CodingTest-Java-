package BAEKJOON재귀;

import java.util.Scanner;

public class BAEKJOON10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(factorial(N));
    }

    private static int factorial(int N) {
        if( N == 0){
            return 1;
        }
        else {
            return N * factorial(N-1);
        }
    }
}
