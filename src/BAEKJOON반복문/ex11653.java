package BAEKJOON반복문;

import java.util.Scanner;

public class ex11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=2; i<N; i++){
            while (N%i ==0){
                System.out.println(i);
                N/=i;
            }
        }
        if(N!=1){
            System.out.println(N);
        }

    }
}
