package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); //입력 받는 방법
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int i = 0;
        int count = 0;
        while (i<=V){
            i+=A;
            count++;
            if(i==V){
                break;
            }
            i-=B;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.println(sb);
    }
}
