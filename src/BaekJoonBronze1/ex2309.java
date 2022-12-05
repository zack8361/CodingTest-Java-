package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int i=0;
        int sum2 = 0;
        int sum =0;
        for(int j=0; j<9; j++) {
            System.out.println(arr[j]);
        }
    }
}
