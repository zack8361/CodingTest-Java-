package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner kong= new Scanner(System.in);
        int num = kong.nextInt();
        double result[] = new double[num];

        for(int i=0; i<num; i++){
            int num2 = kong.nextInt();
            int sum = 0;
            double average =0;
            int count =0;
            int[] array = new int[num2];
            for(int j=0; j<array.length; j++){
                array[j] = kong.nextInt();
                sum += array[j];
                average = (sum/num2);

            }
            result[i] = average;
        }
        for(double i : result) {
            System.out.println(i);
        }
    }
}
