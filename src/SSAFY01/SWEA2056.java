package SSAFY01;

import java.util.Scanner;

public class SWEA2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        for(int i=0; i<S.length(); i++){
            System.out.print((int)S.charAt(i)-64 + " ");
        }
    }
}
