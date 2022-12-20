package Programmers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int[] arr = {5,9,7,10};
        int divisor = sc.nextInt();
        System.out.println(solution(arr,divisor));
    }

    private static int[] solution(int[] arr, int divisor) {
        int[] answer ={};
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                a1.add(arr[i]);
            }
        }
        if(a1.isEmpty()){
            a1.add(-1);
        }
        answer = new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i] = a1.get(i);
        }
        return answer;
    }
}
