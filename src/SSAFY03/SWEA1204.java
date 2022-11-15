package SSAFY03;

import java.util.Scanner;

public class SWEA1204 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int T = kong.nextInt();

        for(int i=0; i<T; i++){
            int num = kong.nextInt();
            int[] arr = new int[101];

            for(int j=0; j<1000; j++){
                arr[kong.nextInt()]++;
            }
            int max = 0;
            int index =0;

            for(int j=0; j<arr.length; j++){
                if(arr[j]>max){
                    max = arr[j];
                    index = j;
                }
            }
            System.out.println(index);
        }
    }
}
