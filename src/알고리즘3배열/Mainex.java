package 알고리즘3배열;

import java.util.Scanner;

public class Mainex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            System.out.print("arr[" + i+"] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("검색할 값 : ");
        int M = sc.nextInt();
        System.out.println("그 값은 arr["+arr[M]+"]에 있습니다.");
    }
}
