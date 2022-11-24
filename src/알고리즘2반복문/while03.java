package 알고리즘2반복문;

import java.util.Scanner;

public class while03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 N까지의 합을 구하세요");


        int sum =0;
        int N;
        do {
            System.out.print("n값 : ");
            N = sc.nextInt();
        }while (N<=0); //n값이 0 혹은 0보다 작은값이 들어올 동안 do 실행

        for (int i=1; i<=N; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
