package SSAFY02;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Solution s = new Solution();
        int score[] = {2,3,2,3,1,1,1};
        int k = 3; // 최대값
        int m = 4; //박스당 들어가는 사과의 수
        System.out.println(s.Solution(k,m,score));
    }
}


class Solution{

    public int Solution(int k, int m, int[] score){
        Arrays.sort(score); //배열 오름 차순으로 정렬하고
        int answer = 0;
        for(int i=score.length; i>=m; i-=m){
            answer += score[i-m]*m;
        }
        return answer;
    }
}


