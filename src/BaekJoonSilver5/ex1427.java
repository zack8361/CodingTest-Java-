package BaekJoonSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ex1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
