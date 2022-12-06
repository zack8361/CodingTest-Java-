package 알고리즘6재귀;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int[] result = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++){
            if(K>arr[i]){
                result[i] = K/arr[i];
                K%=arr[i];
            }
            sum +=result[i];
        }
        System.out.println(sum);
    }
}
