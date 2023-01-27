package KongBlog;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * 가장 가까운 글자 (Programmers lv.1)
 */

/**
 * HashMap = map.get(키값) 하면 벨류 찾을수 있다.
 */
public class Programmers142086 {
    public static void main(String[] args) {
        String s= "banana";
        System.out.println(solution(s));
    }

    private static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.isEmpty()){
                map.put(s.charAt(i),i);
                answer[i] = -1;
            }
            else {
                if(!map.containsKey(s.charAt(i))){
                    answer[i] = -1;
                    map.put(s.charAt(i),i);
                }
                else {
                    answer[i] = i-map.get(s.charAt(i));
                    map.put(s.charAt(i),i);
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
