package BAEKJOON반복문;

import java.util.Scanner;

public class ex1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int copy = N; //입력 받은 값을 하나 복사해둔다. 중요
        int count =0;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;
        }while (copy !=N); // copy == N 이  될때까지 do 문 돌려라
        System.out.println(count);
    }
}
