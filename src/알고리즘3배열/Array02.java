package 알고리즘3배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
        for(int i=0; i<arr.length/2; i++){
            swap(arr,i,arr.length-i-1);
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int a = arr[i];
        arr[i] = arr[i1];
        arr[i1] = a;
    }
}