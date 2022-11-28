package BAEKJOON반복문;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<5; i++){
            while (N%i ==0){
                System.out.println(i);
                N/=i;
            }
        }
    }
}

