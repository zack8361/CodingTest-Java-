package KongBlog;

/*
백준 실버 3(구간 합 구하기 4) -->누적합 Prefix Sum // 불변하는 데이터
 */

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            bw.write(arr[b]-arr[a-1]+"\n");
        }
        bw.flush();
    }
}
