package BAEKJOON정렬;

import java.util.Scanner;

public class BaekJoon2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int max =0;
        int idx =0;
        int idx2=0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                if(max<A[i][j]){
                    max = A[i][j];
                    idx = i;
                    idx2 = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(idx+1 + " " + idx2 +1);
        sc.close();
    }
}
