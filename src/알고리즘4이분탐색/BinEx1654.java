package 알고리즘4이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class BinEx1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr[arr.length-1];
        int mid =0;
        int count = 0;
        while (start<=end){
            mid = (start+end)/2;
            for(int i=0; i<N; i++){
                if(arr[i]>mid){

                }
            }
        }
    }
}
