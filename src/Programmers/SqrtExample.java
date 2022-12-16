package Programmers;

import java.util.Scanner;

public class SqrtExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        System.out.println(solution(n));
    }



    //리턴 타입을 적는다.
    private static long solution(long n) {
        long answer =0;
        //a 가 121의 제곱근인 11을 저장한다.
        long a= (long) Math.sqrt(n);

        //11의 제곱이 n과 같다면 (11+1)의 제곱을 구한다.
        if(Math.pow(a,2) == n){
            answer = (long) Math.pow(a+1,2);
        }
        //그게 아니면 -1을 뱉어낸다.
        else {
            answer = -1;
        }
        return answer;
    }
}

//
//class Solution {
//    public int[] solution(long n) {
//        String s = String.valueOf(n);
//        StringBuilder sb = new StringBuilder(s);
//        sb = sb.reverse(); //reverse() 메소드를 이용하기 위하여 StringBuilder인스턴스 생성
//
//        String[] str= String.valueOf(sb).split("");
//        int[] answer = new int[str.length];
//
//        for(int i=0; i<str.length; i++){
//            answer[i] = Integer.parseInt(str[i]);
//        }
//        return answer;
//    }
//}