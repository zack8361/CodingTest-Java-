package 알고리즘4탐색;

import java.util.Arrays;
import java.util.Scanner;

public class BinEx2343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length-1];
        int mid = 0;
        while (start<=end){
            int count = 0;
            mid = (start+end)/2;
            for(int i=0; i<N; i++){
                count += (arr[i]/mid);
            }
            if(count>=M){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        System.out.println(end);
    }
}
