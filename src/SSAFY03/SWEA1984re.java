package SSAFY03;

import java.util.Scanner;

public class SWEA1984re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10];
        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for(int tc=0; tc<N; tc++){

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
                        for(int i=0; i< arr.length; i++){
                if(max<arr[i]){
                    max = arr[i];
                }
                if(min>arr[i]){
                    min = arr[i];
                }
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}