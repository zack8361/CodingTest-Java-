package Programmers2;

import java.util.Arrays;
import java.util.Stack;

public class CorrectParenthesesStack {
    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        int limit = 100;

        System.out.println(solution(people,limit));
    }

    private static int solution(int[] people, int limit) {
        int answer =0;
        int count = 0;
        Arrays.sort(people);
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<people.length; i++){
            int s = people[i];
            if(stack.isEmpty()){
                stack.push(s);
            }
            else {
                if(stack.peek() + s<=100){
                    count++;
                }
            }
        }
        System.out.println(stack);
        System.out.println(count);
        return answer;
    }
}
