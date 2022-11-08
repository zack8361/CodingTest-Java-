package SSAFY02;

import java.util.Scanner;

//Contains 는 String 에서만 쓸수있다.
public class SWEA1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();



        for(int i=1; i<=N; i++){
            String tmp = String.valueOf(i); //int i 를 문자열로 변경하여 TMP 에 담아준다

            //tmp가 3,6,9 를 담고 있다면, 3,6,9 를 가르키는 문자열에는 - 를 찍어라
            if(tmp.contains("3")||tmp.contains("6") ||tmp.contains("9")){
                for(int j=0; j<tmp.length(); j++){
                    if(tmp.charAt(j) == '3' ||tmp.charAt(j) == '6'||tmp.charAt(j) == '9'){
                        System.out.print("-");
                    }
                }
                System.out.print("");
            }
            //그렇지 않다면 나머지 문자열을 출력하라 라는 문제
            else {
                System.out.print(i + " ");
            }
        }
    }
}