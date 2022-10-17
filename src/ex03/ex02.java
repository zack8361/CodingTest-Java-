package ex03;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        System.out.println("정수를 입력하시오 >>");
        int num = kong.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
