package 인프런1;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int cnt =1;
        for(int i=0; i<N; i++){
            cnt =1;
            for(int j=0; j<N; j++){
                if(arr[i]<arr[j]){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
