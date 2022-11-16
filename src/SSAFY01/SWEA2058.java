package SSAFY01;

import java.util.Scanner;

public class SWEA2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num/1000;
        int b = (num%1000)/100;
        int c = (num%100)/10;
        int d = (num %10);
        System.out.println(a +b+c+d);
    }
}
