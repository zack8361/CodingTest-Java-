package BAEKJOON재귀;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(bee(N));
    }

    private static int bee(int n) {

        int range =2;
        int count = 1;
        if(n==1 ){
            return 1;
        }
        else {
            while (range<=n) {
                range = range + (6 * count);
                count++;
            }
            return count;
        }
    }
}
