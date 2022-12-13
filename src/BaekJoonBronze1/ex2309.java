package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum +=arr[i];
        }
        Arrays.sort(arr);

        int a = 0,b = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(sum-arr[i]-arr[j] ==100){
                    a = arr[i];
                    b = arr[j];
                    break;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);

    }
}
