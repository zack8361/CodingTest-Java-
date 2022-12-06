package 알고리즘6재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("두 정수의 최대공약수를 구합니다.");
        System.out.print("정수를 입력하세요 : ");
        int A = Integer.parseInt(br.readLine());
        System.out.print("정수를 입력하세요 : ");
        int B = Integer.parseInt(br.readLine());
        sb.append("최대 공약수는 : ").append(gcd(A,B)).append('\n').append("최소 공배수는 : ").append(gbd(A,B));
        System.out.println(sb);
    }
    private static int gbd(int a, int b) {
        return a*b/gcd(a,b);
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
