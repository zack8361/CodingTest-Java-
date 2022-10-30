package 문자열;

import java.util.Scanner;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//숫자를 String 으로 받아서 스트링
public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        String num2 = kong.next();
        int sum = 0;
        for(int i=0; i<num; i++){
            sum+=num2.charAt(i)-48;
        }
        System.out.println(sum);

    }
}
