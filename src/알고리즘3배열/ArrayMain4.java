package 알고리즘3배열;

import java.util.Scanner;

public class ArrayMain4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 a의 요소값 입력: ");
        int N = sc.nextInt();
        int[]a = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("["+i+"] : ");
            a[i]=sc.nextInt();
        }

        System.out.print("배열 b의 요소값 입력: ");
        int M = sc.nextInt();
        int[]b = new int[M];
        for(int i=0; i<M; i++){
            System.out.print("["+i+"] : ");
            b[i]=sc.nextInt();
        }
        rcopy(a,b);
    }

    private static void rcopy(int[] a, int[] b) {

        int num = a.length <= b.length ? a.length : b.length;
        for(int i=0; i<num/2; i++){
            swap(b,i,num-i-1);
        }
        for(int i=0; i<num; i++){
            a[i] = b[i];
            System.out.println(a[i]);
        }

    }

    private static void swap(int[] b, int i, int i1) {
        int x = b[i];
        b[i] = b[i1];
        b[i1] = x;
    }
}
