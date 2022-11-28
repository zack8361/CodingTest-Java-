package BAEKJOON반복문;

import java.util.Scanner;

public class ex2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count =0;
        int sum = 0;
        int min = 100;
        for(int i=N; i<=M; i++){
            count = 0;
            for(int j=1; j<M; j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count == 2){
                sum +=i;
                for(int k=0; k<i; k++){
                    if(min>i){
                        min = i;
                    }
                }
            }
        }
        if(sum == 0){
            System.out.println("-1");
        }
        else {
            System.out.println(min);
            System.out.println(sum);
        }
    }
}
