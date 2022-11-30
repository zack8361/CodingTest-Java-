package 알고리즘4탐색;

import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int N = sc.nextInt();
        int[] arr= new int[N];
        System.out.println("오름차순으로 입력하세요.");

        for(int i=0; i<N; i++){
            System.out.print("arr["+i+"]:");
            arr[i] = sc.nextInt();
        }
        System.out.print("검색할 값 : ");
        int M =sc.nextInt();

        int idx = binSearch(arr,N,M);
        System.out.println(idx);
    }

    private static int binSearch(int[] arr, int n, int m) {
        int pl = 0; //검색값의 첫인덱스
        int pr = n-1; //검색값의 마지막 인덱스
        do{
            int pc = (pl+pr)/2;
            if(arr[pc] == m){
                return pc;
            }
            else if(arr[pc]<m){
                pl = pc +1;
            }
            else {
                pr = pc-1;
            }
        }while (pl<=pr);
        return -1;
    }
}

