package Programmers2;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum = 0;
            for(int j=i+1; j<=n; j++){
                sum +=j;
                if(sum == n){
                    answer++;
                    break;
                }else if( sum > n){
                    break;
                }
            }
        }

        return answer;
    }
}
