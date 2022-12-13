package 알고리즘6재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exHanoi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int N = Integer.parseInt(br.readLine());

        move(N,1,3);
        //1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김.
    }

    private static void move(int n, int x, int y) {

    }
}
