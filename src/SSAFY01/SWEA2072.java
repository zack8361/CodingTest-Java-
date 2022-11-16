package SSAFY01;

import java.util.Scanner;


//홀수만 구하기 매우 기본적인 문제

public class SWEA2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int sum=0;
            for(int i=0; i<10; i++){
                int num = sc.nextInt();
                if(num%2==1){
                    sum+=num;
                }
            }
            System.out.println(sum);

        }
    }
}
