package SSAFY;

import java.util.Scanner;

public class ex09 {
    //주어진 숫자만큼 문자열 출력하기
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        for(int i=0; i<num; i++){
            System.out.print("#");
        }
    }
}
