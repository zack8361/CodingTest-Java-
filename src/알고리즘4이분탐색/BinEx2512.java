package 알고리즘4이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class BinEx2512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int answer = 0;


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length - 1];
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) {
                    //배열이 지정한 mid 보다 크다면
                    sum += mid;
                    //mid 를 더해라
                } else { //arr[i] <mid
                    sum += arr[i];
                }
            }
            if (sum < M) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = Math.max(answer, mid);
            }
        }
        System.out.println(end);
        System.out.println(answer);
    }
}
