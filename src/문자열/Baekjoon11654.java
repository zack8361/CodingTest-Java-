package 문자열;

import java.util.Scanner;

public class Baekjoon11654 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        String alp = kong.next();
        for(int i=0; i<alp.length(); i++){
            System.out.println((int) alp.charAt(i));
        }

    }
}
