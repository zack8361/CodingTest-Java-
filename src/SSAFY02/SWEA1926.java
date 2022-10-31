package SSAFY02;

import java.util.Scanner;
//3-6-9 알고리즘
public class SWEA1926 {
    public static void main(String[] args) {

        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();

        for (int i = 1; i <= num; i++) {
            String tmp = String.valueOf(i); //for 문에 있는 int i 들을 String tmp로 바꿔준다.
            if (tmp.contains("3") || tmp.contains("6") || tmp.contains("9")) {
                for (int j = 0; j < tmp.length(); j++) {
                    if (tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}