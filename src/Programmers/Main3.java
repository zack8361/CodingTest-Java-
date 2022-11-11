package Programmers;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1};

        Arrays.sort(arr);
        for(int i=0; i<2; i++){
            System.out.println(arr[i+1]);
        }
    }
}
