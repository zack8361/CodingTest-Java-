package Programmers;

import java.util.Scanner;

public class difficult6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(solution(left,right));
    }

    private static int solution(int left, int right) {
        int count =0;
        int sum = 0;
        for(int i=left; i<=right; i++) {
            count = 0;
            for (int j = 1; j <= right; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count%2 ==0){
                sum +=i;
            }
            else {
                sum-=i;
            }
        }
        return sum;
    }
}
