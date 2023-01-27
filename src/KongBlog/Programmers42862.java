package KongBlog;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Programmers42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        System.out.println(solution(n,lost,reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<lost.length; i++){
            deque.addLast(lost[i]);
        }
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]-1 == lost[i] || reserve[j]+1 ==lost[i]){
                    if(lost.length>reserve.length){
                        deque.pollLast();
                        deque.addLast(lost[j]);
                    }
                    else {
                        deque.pollLast();
                    }
                }
            }
        }
        System.out.println(deque);
        if(deque.isEmpty()){
            return n;
        }
        else {
            return n-deque.size();
        }
    }
}
