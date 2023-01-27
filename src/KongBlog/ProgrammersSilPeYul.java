package KongBlog;

import java.util.*;

public class ProgrammersSilPeYul {
    public static void main(String[] args) {
        int N = 5;
        int[] stages= {2,1,2,6,2,4,3,3};
        System.out.println(solution(N,stages));
    }

    private static int[] solution(int n, int[] stages) {
        Map<Integer,Double> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            double total = 0;
            double fail = 0;
            for(int j=0; j<stages.length; j++){
                if(i<=stages[j]){
                    total++;
                }
                if(i==stages[j]) {
                    fail++;
                }
                if(total ==0 && fail ==0){
                    total = 1;
                }
            }
            map.put(i,fail/total);
        }
        int[] answer = new int[n];

        for(int i=0; i<answer.length; i++){
            int keyIndex = 0;
            double max = -1;
            for(int key: map.keySet()){
                if(max<map.get(key)){
                    max = map.get(key);
                    keyIndex = key;
                }
            }
            answer[i] = keyIndex;
            map.remove(keyIndex);
        }
        return answer;
    }
}
