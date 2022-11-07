package SSAFY02;

import java.util.Scanner;

//간단한 소인수분해 문제
public class SWEA1945 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int t = kong.nextInt();

        for(int tc =1; tc<t; tc++){
            int N = kong.nextInt();
            int a =0;
            int b =0;
            int c =0;
            int d =0;
            int e =0;

            while (true){
                if(N%2 ==0){
                    N = N/2;
                    a++;
                }
                else if(N%3==0){
                    N = N/3;
                    b++;
                }
                else if(N%5==0){
                    N = N/5;
                    c++;
                }
                else if(N%7==0){
                    N = N/7;
                    d++;
                }
                else if(N%11==0){
                    N = N/11;
                    e++;
                }
                if(N==1){
                    break;
                }
            }
            System.out.printf("#%d %d %d %d %d %d\n",tc,a,b,c,d,e);
        }
    }
}
