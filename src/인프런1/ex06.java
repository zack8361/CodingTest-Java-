package 인프런1;

import java.util.Arrays;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = new int[N];
        for(int i=0; i<N; i++){
            int answer = 0;
            int tmp = arr[i];
            while (tmp>0){
                int t = tmp%10;
                answer = answer*10 +t;
                tmp = tmp/10;
            }
            result[i] = answer;
        }

    }
}
