package SSAFY;

import java.util.Arrays;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        int[] Array = new int[num];

        for(int i=0; i<Array.length; i++){
            Array[i] = kong.nextInt();
        }
        System.out.println(Array[Array.length/2]); //배열에서의 중간
        Arrays.sort(Array);
        System.out.println(Array[Array.length-1]); //배열의 최대값 뽑기

    }

}
