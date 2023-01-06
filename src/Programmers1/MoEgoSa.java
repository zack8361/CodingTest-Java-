package Programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MoEgoSa {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        System.out.println(solution(answers));
    }

    private static int[] solution(int[] answers) {
        List<Integer> supo1 = new ArrayList<>();
        supo1.add(1);
        supo1.add(2);
        supo1.add(3);
        supo1.add(4);
        supo1.add(5);

        List<Integer> supo2 = new ArrayList<>();
        supo2.add(2);
        supo2.add(1);
        supo2.add(2);
        supo2.add(3);
        supo2.add(2);
        supo2.add(4);
        supo2.add(2);
        supo2.add(5);

        List<Integer> supo3 = new ArrayList<>();
        supo3.add(3);
        supo3.add(3);
        supo3.add(1);
        supo3.add(1);
        supo3.add(2);
        supo3.add(2);
        supo3.add(4);
        supo3.add(4);
        supo3.add(5);
        supo3.add(5);

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i=0; i<answers.length; i++){
            if(supo1.get(i) == answers[i]){
                count1++;
            }
            if(supo2.get(i) == answers[i]){
                count2++;
            }
            if(supo3.get(i) == answers[i]){
                count3++;
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,count1);
        map.put(2,count2);
        map.put(3,count3);

        int max = 0;
        for(int i: map.keySet()){
            if(map.get(i)>max){
                max = map.get(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i) == max){
                result.add(i);
            }
        }
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}
