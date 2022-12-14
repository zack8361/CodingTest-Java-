package BaekJoonSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//연속된 문자 인지 아닌지 판별 해야함

public class ex1316해결x {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int count =0;
        for(int i=0; i<N; i++){
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);

    }

    private static boolean check() throws IOException {
        boolean[] check = new boolean[26]; //알파벳 개수가 26개 기 때문
        int prev = 0;
        String str = br.readLine();

        return true;
    }

}
