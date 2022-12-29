package Programmers2;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            answer = arr[n] % 1234567;
        }

        return answer;

    }
}
