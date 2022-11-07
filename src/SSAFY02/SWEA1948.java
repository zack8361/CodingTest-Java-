package SSAFY02;

import java.util.Scanner;

//날짜 구하기 풀이방법
//1. 총일수를 두개 구해서 뺀다음 + 1
//2. day를 1차원배열로 선언해두고 month 만큼의 포문으로 대입시킨다.
public class SWEA1948 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        //0~ 11월까지의 일수 이다.
        int[]date = {31,28,31,30,31,30,31,31,30,31,30,31};
        int tc = kong.nextInt();
        for(int t=0; t<tc; t++){
            int a = kong.nextInt();
            int b = kong.nextInt();
            int c = kong.nextInt();
            int d = kong.nextInt();

            int sum = 0;
            for(int i=0; i<a; i++){
                sum+= date[i];
            }
            sum  = sum + b;

            int sum2 = 0;
            for(int i=0; i<c; i++){
                sum2+= date[i];
            }
            sum2  = sum2+ d;

            System.out.println(sum2-sum +1);
        }
    }
}
