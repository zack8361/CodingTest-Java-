package Programmers1;

import java.util.Arrays;
import java.util.Stack;

public class HateSameNum {
    public static void main(String[] args) {
        int[] arr ={4,4,4,3,3};

        System.out.println(solution(arr));

    }

    private static int[] solution(int[] arr) {
        int[] answer ={};
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            int s = arr[i];
            if(stack.isEmpty()){
                stack.push(s);
            }
            else {
                if(stack.peek() == s){
                    stack.pop();
                    stack.push(s);
                }
                else {
                    stack.push(s);
                }
            }
        }

        answer = new int[stack.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
