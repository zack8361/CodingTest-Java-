package Programmers;

import java.util.Arrays;

public class budget {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget =9;

        System.out.println(solution(d,budget));

    }

    private static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int count =0;
        for(int i=0; i<d.length; i++){
            answer+=d[i];
            count++;
            if(answer>budget){
                answer -= d[i];
                count--;
                break;
            }
        }
        return count;
    }
}
