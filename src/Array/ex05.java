package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner kong= new Scanner(System.in);
        int num = kong.nextInt();
        for(int i=0; i<num; i++) {
            int student = kong.nextInt();
            int[] Array = new int[student];
            double sum =0;
            for (int j = 0; j < Array.length; j++) {
                int grade = kong.nextInt();
                sum += grade;
            }
        }

    }
}
