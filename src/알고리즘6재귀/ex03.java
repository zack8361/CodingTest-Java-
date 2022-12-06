package 알고리즘6재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.print("정수를 입력하세요 : ");
        int N = Integer.parseInt(br.readLine());

        recur(N);
    }

    private static void recur(int n) {
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }

    }
}