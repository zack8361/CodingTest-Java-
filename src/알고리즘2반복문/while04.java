package 알고리즘2반복문;

import java.util.Scanner;

public class
while04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        int N = sc.nextInt();

        int i=1;
        int sum =0;
        while (i<=N) {

            if (i % 2 == 0) {
                sum -= i;
                i++;
            } else {
                sum += i;
                i++;
            }
        }
        System.out.println(sum);
    }
}
