package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex15649 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("요솟수 :");
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            System.out.print("arr[" + i +"]:");
            arr[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(arr,N);
        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
        }
    }
    private static void bubbleSort(int[] arr, int n) {
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
