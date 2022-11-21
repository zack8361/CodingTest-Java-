package BAEKJOON정렬;

import java.util.Scanner;

public class BaekJoon2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[100][100];

        int T = sc.nextInt();

        for(int tc=0;tc<T; tc++){
             int x = sc.nextInt();
             int y = sc.nextInt();

             for(int i=x; i<x+10; i++){
                 for(int j=y; j<y+10; j++){
                     map[i][j] = 1;
                 }
             }
        }
        int count =0;
        for(int i=0; i<100; i++) {
            for (int j = 0; j < 100; j++) {
                if (map[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
