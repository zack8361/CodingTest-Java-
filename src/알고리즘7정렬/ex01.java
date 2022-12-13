package 알고리즘7정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {
    public static void main(String[] args) throws IOException {
        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("arr["+ i + "]:");
            arr[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(arr,N);
        System.out.println("오름차순으로 정렬했습니다.");

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }

    private static void bubbleSort(int[] arr, int n) {
        for(int i=0; i<n-1; i++){
            for(int j = n-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
