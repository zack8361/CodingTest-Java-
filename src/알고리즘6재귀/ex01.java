package 알고리즘6재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수를 입력하세요 : ");
        int N = Integer.parseInt(br.readLine());
        System.out.println(N +"의 팩토리얼은 "+factorial(N));

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
