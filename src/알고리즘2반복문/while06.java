package 알고리즘2반복문;

import java.util.Scanner;

public class while06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*을 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
        System.out.print("n값 : ");
        int n = sc.nextInt();
        System.out.print("w값 : ");
        int w = sc.nextInt();



        int count =0;
        int i = 0;
        while (i<n) {
            System.out.print("*" + " ");
            count++;
            i++;
            if(count == w){
                System.out.println();
                count = 0;
            }
        }
    }
}
