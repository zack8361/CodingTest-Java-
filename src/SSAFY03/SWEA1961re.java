package SSAFY03;

import java.util.Scanner;

public class SWEA1961re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc < T; tc++) {
            int N = sc.nextInt();
            int[][] map = new int[N][N];
            int[][] result = new int[N][N];
            int[][] result2 = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    result[i][j] = map[map.length - 1 - j][i];
                    System.out.print(result[i][j]);
                }
                System.out.println();
            }
        }
    }

}
