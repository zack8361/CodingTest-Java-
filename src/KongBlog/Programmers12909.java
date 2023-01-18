package KongBlog;

import java.util.Arrays;
import java.util.Stack;

/**
 * 올바른 괄호 (Programmers.LV2) -> 큐 OR 스택 활용
 */

public class Programmers12909 {
    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s));
    }
    
    private static boolean solution(String s) {
        char[] ch = s.toCharArray();

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        if(ch[0] == ')'){
            return false;
        }
        if(ch[ch.length-1] == '('){
            return false;
        }

        for(int i=0; i<ch.length; i++){
            if(ch[i] == '('){
                stack1.push(String.valueOf(ch[i]));
            }
            else {
                stack2.push(String.valueOf(ch[i]));
            }
            if(stack2.size()>stack1.size()){
                return false;
            }
        }
        if(stack1.size() == stack2.size()){
            return true;
        }
        else {
            return false;
        }

    }
}
