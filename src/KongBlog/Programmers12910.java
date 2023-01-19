package KongBlog;

import java.util.Stack;

/**
 * 올바른 괄호(프로그래머스 Lv.2) -> 스택/큐
 */
public class Programmers12910 {
    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
            else {
                if(c == ')' && stack.peek() =='('){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }

        return answer;
    }
}
