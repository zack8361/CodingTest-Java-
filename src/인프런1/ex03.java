package 인프런1;

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    private static class Main {
        public String solution(String str) {
            String answer = " ";
            String[] s =  str.split(" "); //배열에 쪼개서 담아라.
            int min = -1;
            for(String x: s){
                int len = x.length();
                if(len>min){
                    min = len;
                    answer = x;
                }
            }
            return answer;
        }
    }
}
