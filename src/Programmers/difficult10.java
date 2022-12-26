package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class difficult10 {
    public static void main(String[] args) {
        String s = "speople unFollowed  me";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++){
            String tt = str[i];
            if (!"".equals(tt)) {
                answer += tt.substring(0,1).toUpperCase() + tt.substring(1).toLowerCase()+ " ";
            }
        }
        answer = answer.substring(0,answer.length()-1);
        return answer ;
    }
}
