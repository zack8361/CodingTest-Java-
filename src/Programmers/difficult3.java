package Programmers;

import java.util.Arrays;

public class difficult3 {
    public static void main(String[] args) {
        String s = "qwers";

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        StringBuilder sb = new StringBuilder();
        //짝수가 아닐떄.
        if(str.length%2!=0){
            for(int i=str.length/2; i<str.length/2+1; i++){
                sb.append(str[i]);
            }
        }

        else {
            for(int i=str.length/2-1; i<str.length/2+1; i++){
                sb.append(str[i]);
            }
        }
        return String.valueOf(sb);
    }
}