package SSAFY;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        int[] Array = new int[num];

        for(int i=0; i<Array.length; i++){
            int sum =0;
            for(int j=0; j<10; j++){
                int number = kong.nextInt();
                sum += number;
            }
            Array[i] = sum;
        }
        for(int i=0; i<Array.length; i++){
            System.out.println(Array[i]/10);
        }
    }
}
