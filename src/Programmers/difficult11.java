package Programmers;

import java.util.Arrays;

public class difficult11 {
    public static void main(String[] args) {
        String s = "abc abcd abcde";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer ="";
        String[] str = s.split(" ");

        for(int i=0; i<str.length; i++){
            String[] strs = str[i].split("");
            for(int j=0; j<strs.length; j++){
                if(j%2 ==0){
                    answer+=strs[j].toUpperCase();
                }
                else if (j%2 !=0){
                    answer+=strs[j];
                }
            }
            if(answer.length() == s.length()){
                break;
            }
            answer+=" ";
        }

        return answer;
    }
}
