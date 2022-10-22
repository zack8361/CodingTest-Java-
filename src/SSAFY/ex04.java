package SSAFY;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int numb = kong.nextInt();
        int[] Array = new int[10];

        for(int i=0; i<numb; i++) {
            for (int j = 0; j < Array.length; j++) {
                Array[j] = kong.nextInt();
            }
            Arrays.sort(Array);
            System.out.println(Array[Array.length - 1]);
        }
    }

}
