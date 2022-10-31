package SSAFY02;

//10개의 수를 입력받아서, 최대의 수와 최소의 수를 제외한 나머지의 평균값을 출력하는 프로그램
//소수점 첫째 자리에서 반올림한 정수를 출력한다.

import java.util.Scanner;

//가장 첫 줄에는 테스트 케이스의 개수 t 가 주어지고, 그아래로 각 테스트 케이스가 주어진다.
public class SWEA1984 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int testcase =kong.nextInt();
        int[] arr;
        for(int i=0; i<testcase; i++){
            arr = new int[10];
            int max = arr[0];
            int min = arr[0];
            for(int j=0; j<arr.length; j++){
                 if(max<arr[j]){
                     max = arr[j];
                 }
                 if(min>arr[j]){
                     min = arr[j];
                 }
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}
