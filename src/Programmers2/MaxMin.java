package Programmers2;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
    private static String solution(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];

        for(int i=0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ").append(arr[arr.length-1]);
        System.out.println(sb);

        return String.valueOf(sb) ;
    }
}
