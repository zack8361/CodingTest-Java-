package Programmers;

import java.util.Scanner;

public class difficult4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(solution(N));
    }

    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sb.append("박");
            }
            else {
                sb.append("수");
            }
        }
        return String.valueOf(sb);
    }
}
