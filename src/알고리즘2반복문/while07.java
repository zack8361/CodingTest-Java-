package 알고리즘2반복문;

import java.util.Scanner;

public class while07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2자리의 양수를 입력하세요.");
        int n;
        do {
            System.out.println("no값 : ");
            n = sc.nextInt();
        }while (n<10 || n>99);

        System.out.println("변수 n 값은" + n+ "이 되었습니다");
    }
}
