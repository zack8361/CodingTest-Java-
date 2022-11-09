package SSAFY02;

//지그재그 숫자
//1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뻈을때 최종 누적된 값을 구해보자


import java.util.Scanner;

public class SWEA1986 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int testcase = kong.nextInt();
        for(int i=0; i<testcase; i++){
            int num = kong.nextInt();
            int a =0;
            int b = 0;
            for(int j =0; j<=num; j++){
                if(j%2 ==1){
                    a+=j;
                }
                else if(j%2 ==0){
                    b+=j;
                }
            }
            System.out.println(a-b);
        }


    }
}
