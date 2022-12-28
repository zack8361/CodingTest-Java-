package Programmers1;

import java.util.Arrays;

public class KNumBer {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(array,commands));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] result = {};
        for(int i=0; i<commands.length; i++){
            int a = commands[i][0]; //2,4,1
            int b = commands[i][1]; //5,4,1
            int c = commands[i][2]; //3,1,3
            int d = 0;
            result = new int[b-a+1];
            for(int j=a; j<=b; j++){

            }
        }
        System.out.println(Arrays.toString(result));
        return answer;
    }
}
