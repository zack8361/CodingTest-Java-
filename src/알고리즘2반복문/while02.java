package 알고리즘2반복문;

import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 정수 a 와 b 를 입력하시오");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumof(a,b));
    }

    private static int sumof(int a, int b) {

        int sum =0;
        sum = (a+b) * (b/2);

        if(b%2 !=0){
            sum += (b+1)/2;
        }

        return sum;
    }
}
