package 알고리즘3배열;

import java.util.Scanner;

public class ArrayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 갯수 입력 : ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        //배열 입력
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOf(arr));
    }

    private static int sumOf(int[] arr) {
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
