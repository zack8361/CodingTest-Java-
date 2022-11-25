package 알고리즘3배열;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 1, 3, 9, 6, 7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println("역순 정렬을 마쳤습니다.");

    }

    private static void reverse(int[] arr) {
        for(int i=0; i<arr.length/2; i++){
            swap(arr,i,arr.length-i-1);
            System.out.println("arr["+i+"] 과 "+ "arr[" +(arr.length-i-1) +"] 교환");
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int a=arr[i];
        arr[i] = arr[i1];
        arr[i1] = a;
    }
}