package BaekJoonSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = factorial(N);
        String[] str = String.valueOf(result).split("");

        int count = 0;
        for(int i=str.length-1; i>0; i--){
            if(!str[i].equals("0")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }

    private static int factorial(int n) {
        if(n>1){
            return n * factorial(n-1);
        }
        else {
            return 1;
        }
    }
}
