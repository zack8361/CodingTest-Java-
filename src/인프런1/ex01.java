package 인프런1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ");
        for(int i=1; i<N; i++){
            if(arr[i]>arr[i-1]){
                sb.append(arr[i] +" ");
            }
        }
        System.out.println(sb);
    }
}
