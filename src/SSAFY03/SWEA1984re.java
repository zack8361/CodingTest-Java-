package SSAFY03;

import java.util.Scanner;

public class SWEA1984re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int tc =0; tc<num; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];

            int max =arr[0];
            int min =arr[0];
            int sum =0;

            for(int i=0; i<N; i++){
                if(max<arr[i]){
                    max =arr[i];
                }
                if(min>arr[i]){
                    min = arr[i];
                }
                else {
                    sum+=arr[i];
                }
            }


        }
    }
}
