package 알고리즘2반복문;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 N까지의 합을 구합니다.");
        System.out.print("N 값 : ");
        int N = sc.nextInt();

        int sum = 0;
        int i=0;

        while (i<N){
            i++;
            sum+=i;
        }
        System.out.println(sum);

    }
}
