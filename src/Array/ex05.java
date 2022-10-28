package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<arr.length; i++){
            int num2 =kong.nextInt();
            int[] arr2 = new int[num2];
            double sum = 0;
            double average =0;
            for(int j=0; j<arr2.length; j++){
                arr2[j] = kong.nextInt();
                sum += arr2[j];
            }
            average = (double) sum/arr2.length;
            int count = 0;
            for(int j=0; j<arr2.length; j++){
                if(arr2[j]>average){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
