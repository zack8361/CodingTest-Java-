package 알고리즘4검색;

import java.util.Scanner;

//선형 검색 알고리즘

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("검색할 값:");
        int M = sc.nextInt();

        int idx = seqSearch(arr, N, M);
        if (idx == -1) {
            System.out.println("다시");
        } else {
            System.out.println(idx);
        }
    }

    //1) for 문
    private static int seqSearch(int[] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            if(arr[i] == m)
                return i;
            }
            return -1;
    }
}
// 2) while 문
//    private static int seqSearch(int[] arr, int n, int m) {
//        int i=0;
//        while (i<n){
//            i++;
//            if(arr[i] == m){
//                return i;
//            }
//            return -1;
//        }
//        return i;
//    }
//}



