package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        sb.append(gcd(A,B)).append('\n').append(gbd(A,B));
        System.out.println(sb);
    }

    private static int gbd(int a, int b) {
        return a*b / gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }
}
