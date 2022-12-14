package BaekJoonSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        System.out.println(Num(N,M));
    }

    private static StringBuilder Num(int n, int m) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=n; i<=m; i++){
            count = 0;
            for(int j=1; j<=m; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count ==2){
                sum +=i;
                for(int k=0; k<i; k++){
                    if(min>i){
                        min = i;
                    }
                }
            }
        }
        if(sum == 0){
            return sb.append("-1");
        }
        else {
            return sb.append(sum).append('\n').append(min);
        }
    }
}
