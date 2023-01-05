package 인프런1;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        arr[0] = 1;
        arr[1] = 1;
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ").append(arr[1]).append(" ");

        for(int i=2; i<N; i++){
            arr[i] = arr[i-1] + arr[i-2];
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
