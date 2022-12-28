package Programmers2;

import java.util.Stack;

public class RemovePairs {
    public static void main(String[] args) {
        String s = "baabaa";
        System.out.println(solution(s));
    }
    private static int solution(String s) {
        int answer = 0;
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<ch.length; i++){
            char c = ch[i];
            if(stack.isEmpty()){
                stack.push(c);
            }
            else {
                if(stack.peek() == c){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        else {
            answer = 0;
        }
        return answer;
    }
}
