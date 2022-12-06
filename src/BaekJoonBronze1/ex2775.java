package BaekJoonBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ex2775 { //BufferReader 를 사용하기 위해서는 throws IOException을 해주어야함.
    public static int[][] arr = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        make_APT();
        //아파트 만들기 함수 실행
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(arr[a][b]).append('\n');
        }
        System.out.println(sb);
    }


    private static void make_APT() {
        for(int i=0; i<15; i++){
            arr[i][1] = 1;
            arr[0][i] = i;
        }
        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
    }
}
