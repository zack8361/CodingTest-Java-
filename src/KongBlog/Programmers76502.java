package KongBlog;


/**
 * 괄호 회전하기(Programmers.Lv2) -> 올바른 괄호 응용문제인듯? 스택으로 풀이.
 */

import java.util.ArrayDeque;
import java.util.Stack;


public class Programmers76502 {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(solution(s));
    }

    private static int solution(String s) {

        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
