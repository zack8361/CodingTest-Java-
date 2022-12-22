package Programmers;

import java.util.Arrays;

public class difficult9 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        System.out.println(solution(arr1,arr2));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1.length; j++){
                answer[i][j]=arr1[i][j] + arr2[i][j];
                System.out.println(answer[i][j]);
            }
        }
        return answer;
    }
}
