package 알고리즘3배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람수 : ");
        Random random = new Random();
        int N = sc.nextInt();
        int[]arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random()*100);
            System.out.println("height[" + i + "]:"+ arr[i]);
        }
        System.out.println("최댓값은" + maxOf(arr));
    }
    private static int maxOf(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
