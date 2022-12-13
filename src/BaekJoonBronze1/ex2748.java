package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        sb.append(fib(N));
        System.out.println(sb);
    }

    private static int fib(int n) {
        if(n<=1){
            return n;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}

