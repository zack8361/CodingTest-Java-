package Programmers;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


//정수 받아서 내림차순으로 정렬후 다시 정수로 구현하기.
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(solution(n));
    }
    private static long solution(long n) {
        String[] str = String.valueOf(n).split(""); //
        Arrays.sort(str);
        return 0;
    }
}
//import java.util.*;
//class Solution {
//    public long solution(long n) {
//        String[] str = String.valueOf(n).split("");
//        Arrays.sort(str);
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<str.length; i++){
//            sb.append(str[i]);
//        }
//        return Long.parseLong(sb.reverse().toString());
//    }
//}