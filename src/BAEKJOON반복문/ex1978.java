package BAEKJOON반복문;

import java.util.Scanner;


//소수 찾기
public class ex1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int total = 0;
        int count = 0;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            count = 0;
            for(int j=1; j<=num; j++) {
                if(num%j ==0){
                    count++;
                }
            }
            if(count == 2){
                total++;
            }
        }
        System.out.println(total);
}
}
