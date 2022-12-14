package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(gbd(A,B));
        }


    }

    private static int gbd(int a, int b) {
        return a*b/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }
}
