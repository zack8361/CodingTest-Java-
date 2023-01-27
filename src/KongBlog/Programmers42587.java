package KongBlog;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * 우선순위 큐 문제 이므로 뒤에풀겠음.
 */
public class Programmers42587 {
    public static void main(String[] args) {
        int[] priorities = {2,1,3,2};
        int location = 2;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int num = priorities[location];

        for(int i=0; i<priorities.length; i++){

        }
        return answer;
    }
}
