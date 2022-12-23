package Programmers2;

import java.util.Arrays;

public class n2ArrayCut{
    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;

        System.out.println(solution(n,left,right));
    }
    private static int[] solution(int n, long left, long right) {
       int[] answer = new int[(int) (right-left)+1];
        System.out.println(answer.length);

        for(int i=0; i<answer.length; i++) {
            int row =



        }

        return answer;
    }
}
