package SSAFY02;

import java.util.Scanner;

public class SWEA1976 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int testcase = kong.nextInt();


        for(int i=0; i<testcase; i++){
            int num = kong.nextInt();
            int num2 = kong.nextInt();

            int num3 = kong.nextInt();
            int num4 = kong.nextInt();

            System.out.print((num + num3)%12 + " ");
            System.out.print((num2+num4)%60 + " ");
        }

    }
}
