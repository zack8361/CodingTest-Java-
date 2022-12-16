package Programmers;

import java.util.Scanner;

public class PpYyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        s = s.toUpperCase();
        int count = 0;
        int count2 = 0;
        String[] str = s.split("");

        for(int i=0; i<str.length; i++) {
            if (str[i].equals("P")) {
                count++;
            }
            if (str[i].equals("Y")) {
                count2++;
            }
        }
        if(count2 == count) {
            return true;
        }
        else {
            return false;
        }
    }
}
