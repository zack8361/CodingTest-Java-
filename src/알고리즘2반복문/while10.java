package 알고리즘2반복문;

import java.util.Scanner;

public class while10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        spira(N);
    }

    private static void spira(int n) {
        for (int i = 1; i <= n; i++) {                    // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)            // n - i 개의 ' ' 을 출력
                System.out.print(' ');
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)    // (i - 1) * 2 + 1 개의 '*' 을 출력
                System.out.print('*');
            System.out.println();                                    // 줄바꿈
        }
    }
    }

