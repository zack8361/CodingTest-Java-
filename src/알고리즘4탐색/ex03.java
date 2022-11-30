package 알고리즘4탐색;

import java.util.Arrays;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1) 첫번재 배열 입력받음
        System.out.print("요솟수 : ");
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("A[" + i + "] : ");
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        //2) 두번째 배열 입력받음
        System.out.print("요솟수 : ");
        int M = sc.nextInt();
        int[] B = new int[M];
        for(int i=0; i<M; i++){
            System.out.print("B[" + i + "] : ");
            B[i] = sc.nextInt();
        }

        for(int i=0; i<M; i++){
            System.out.println(binSearch(A,B[i]));
        }
    }

    private static int binSearch(int[] a, int n) {
        int first = 0; //첫번째
        int end = a.length-1; //a배열의 마지막

        while (first <= end){
            int mid = (first+end)/2;
            if(a[mid] == n){
                return 1;
            }
            else if(a[mid]<n){
                first = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return 0;
    }
}
