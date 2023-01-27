package KongBlog;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 완주 못한 주자 구하기.
 */

public class Programmers42576 {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant,completion));
    }

    private static String solution(String[] participant, String[] completion) {

        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));
        for(int i=0; i<participant.length; i++){
            if(i==completion.length){
                return participant[i];
            }
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return answer;
    }
}
