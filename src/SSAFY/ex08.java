package SSAFY;


import java.util.Scanner;

//문자열을 대문자로 변환하는 프로그램
public class ex08 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        String alp = kong.next();
        //문자열 alp 하나 선언한다
        System.out.println(alp.toUpperCase());
        //문자열 alp.toUpperCase()함수를 사용하여 소문자를 대문자로 변경한 결과를 출력한다.
        String ALP = kong.next();
        //대문자를 소문자로 변경하고 싶을시 = toLowerCase 를 사용한다.
        System.out.println(ALP.toLowerCase());
    }
}
