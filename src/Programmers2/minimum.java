package Programmers2;

import java.util.Arrays;
import java.util.Collections;

public class minimum {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3,4};
        System.out.println(solution(A,B));
    }

    private static int solution(int[] a, int[] b) {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++){
            answer += a[i] * b[b.length-1-i];
        }

        return answer;
    }
}

