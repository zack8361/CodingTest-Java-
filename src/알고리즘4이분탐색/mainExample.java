package 알고리즘4이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class mainExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M =sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int start =0;
        int end = A.length-1;
        int mid =0;
        while (start<=end){
            mid = (start+end)/2;
            for(int i=0; i<N; i++){
                if(A[mid] == M){
                    System.out.println(mid);
                }
            }
            if(A[mid]<M){
                start = mid +1;
            }
            else {
                end = start-1;
            }
        }
    }
}
