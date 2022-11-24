package 알고리즘2반복문;

import java.util.Scanner;

public class while09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
        System.out.println("몇 단 삼각형 입니까?");
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        if(N ==1){
            break;
        }

        }
    }
}
