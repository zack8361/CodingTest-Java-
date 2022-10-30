package 문자열;

import java.util.Scanner;
//아스키코드
//알파벳 소문자, 대문자,숫자 0~9 중 하나가 주어졌을때 , 주어진 숫자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class Baekjoon11654 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        String alp = kong.next();
        for(int i=0; i<alp.length(); i++){
            System.out.println((int) alp.charAt(i));
        }
        kong.close();

    }
}
