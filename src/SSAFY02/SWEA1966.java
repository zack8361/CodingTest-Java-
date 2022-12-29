package SSAFY02;

import java.util.Arrays;
import java.util.Scanner;

//숫자 입력받아 오름차순으로 출력하기 
//1. 배열 로 숫자 선언
//2. Arrays.sort(); 사용하여 배열 오름차순으로 정리후 출력


public class SWEA1966 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();

        for(int i=0; i<num; i++){
            int num2 = kong.nextInt();
            int[] arr = new int[num2];
            for(int j=0; j<arr.length; j++){
                arr[j] = kong.nextInt();
            }
            Arrays.sort(arr);
            for(int k=0; k<arr.length; k++){
                System.out.print(arr[k] + " ");

            }
        }
    }
}
