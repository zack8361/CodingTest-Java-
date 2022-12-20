package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = {10};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=arr.length-1; i>0; i--){
            list.add(arr[i]);
        }
        if(list.size() == 1){
            list.add(-1);
        }
        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
