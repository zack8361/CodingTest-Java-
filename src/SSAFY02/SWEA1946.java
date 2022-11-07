package SSAFY02;

import java.util.Scanner;

//간단한 압축 풀기 문제 입니다.
//1.A 10개 B 7 개 c 5 개를 10 개의 문자열로 끊어서 출력하는 프로그램 입니다.
public class SWEA1946 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int tc = kong.nextInt();
        for(int t =0; t<tc; t++){
            int n = kong.nextInt();
            String[] s = new String[n];
            int[] num = new int[n];

            for(int i=0; i<n; i++){
                s[i] = kong.next();
                num[i] = kong.nextInt();
            }
            int count =0;
            for(int i=0; i<n; i++){
                for(int j=0; j<num[i]; j++){
                    System.out.print(s[i]);
                    count++;
                    if(count ==10){
                        System.out.println();
                        count =0;
                    }
                }
            }
        }
    }
}
