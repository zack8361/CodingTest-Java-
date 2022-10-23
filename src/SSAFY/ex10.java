package SSAFY;

import java.util.Scanner;

//0 부터 입력 숫자 i 까지 2의 i승을 출력하라.
public class ex10 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        for(int i=0; i<num; i++){
            System.out.println((int)Math.pow(2,i));
            //Math.pow 라는 함수의 ((int)Math.pow("2의 i승))
        }

    }
}
