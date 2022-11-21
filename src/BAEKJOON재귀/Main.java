package BAEKJOON재귀;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int T = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(T/c+ " " + T%c);
        }
    }
}
