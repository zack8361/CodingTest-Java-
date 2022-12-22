package Programmers;

import java.util.Arrays;
import java.util.Scanner;

public class difficult7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length() ==6){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)>64 && s.charAt(i)<91){

                    return false;
                }
                else if(s.charAt(i)>96 && s.charAt(i)<123){

                    return false;
                }
            }
        }
        else {
            answer = false;
        }
        return answer;
    }
}
