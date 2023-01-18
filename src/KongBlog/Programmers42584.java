package KongBlog;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * 주식 가격 (Programmers LV.2) -> 큐 스택 활용.
 * 내풀이 -> 이중 포문 큐 스택 활용 못함 ㅂㅅ.
 */

public class Programmers42584 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};

        System.out.println(solution(prices));
    }

    private static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int[] result = new int[prices.length];
        int count = 0;
        for(int i=0; i<prices.length; i++){
            count = 0;
            for(int j=i+1; j<prices.length; j++){
                count++;
                if(prices[i]>prices[j]){
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }

}
