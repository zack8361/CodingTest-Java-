package 알고리즘3배열;

import java.util.Scanner;

public class ArrayMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4};
        int[] copy = {1,2};
        copy(arr,copy);
    }

    private static void copy(int[] arr, int[] copy) {
        int num = arr.length<=copy.length ? arr.length:copy.length;
        for(int i=0; i<num; i++){
            arr[i] = copy[i];
            System.out.println(arr[i]);
        }
    }
}
