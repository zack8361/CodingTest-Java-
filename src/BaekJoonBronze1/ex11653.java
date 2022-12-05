package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=2; i<N; i++){
            while (N%i == 0){
                sb.append(i).append('\n');
                N /=i;
            }
        }
        System.out.println(sb);
    }
}
