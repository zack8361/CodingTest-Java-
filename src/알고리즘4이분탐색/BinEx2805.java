package 알고리즘4이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class BinEx2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //베열의 개수
        int M = sc.nextInt(); //구해야 하는값
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length-1];
        int mid =0;
        while (start<=end){
            mid = (start + end)/2;
            long sum =0;
            for(int i=0; i<N; i++){
                if(arr[i]>mid){//여기서 arr[i]=배열의 원소
                    sum+=arr[i]-mid;
                }
            }
            if(sum>=M){
                start = mid +1;
            }
            else {
                end = mid-1;
            }

        }
        System.out.println(end);
    }
}
