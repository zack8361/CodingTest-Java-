package BAEKJOON재귀;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        System.out.println(cell(A,B,C));
    }

    private static int cell(int a, int b, int c) {
        int result = 0;
        if(c<b){
            return -1;
        }

        else {
            return (a/(c-b)) +1 ;
        }
    }
}
