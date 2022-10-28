package Array2;

import java.util.Scanner;

public class Baekjoon2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[100][100];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(map[j][k] == 1)
                        continue;
                    map[j][k] = 1;
                    ++cnt;
                }
            }
        }
        System.out.println(cnt);
    }
}