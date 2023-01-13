package KongBlog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Programmers.lv2 /(스택,큐)
 * 제목 : 기능개발
 */
public class Programmers42586 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses,speeds));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        int[] per = new int[progresses.length];
        for(int i=0; i< per.length; i++) {
            per[i] = 100 - progresses[i];
        }
        int[] answer = new int[speeds.length];
        for(int i=0; i<per.length; i++){
            if(per[i]%speeds[i]==0){
                answer[i] = per[i]/speeds[i];
            }
            else {
                answer[i] = per[i]/speeds[i]+1;
            }
        }

        int count =1;
        ArrayList<Integer> list = new ArrayList<>();
        int max =answer[0];
        for(int i=1; i< answer.length; i++){
            if(max<answer[i]){
                max = answer[i];
                list.add(count);
                count=1;
            }
            else {
                count+=1;
            }
        }
        list.add(count);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}





