package SSAFY01;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int[] N = new int[10];
            for(int j=0; j<N.length; j++){
                N[j] = sc.nextInt();
            }
            Arrays.sort(N);
            System.out.println(N[N.length-1]);
        }
    }
}
