package SSAFY03;

import java.util.Scanner;

public class SWEA1979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=0; tc<T; tc++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arr = new int[N][N];

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int count =0;
            for(int i=0; i<N; i++){
                int colCheck =0; //가로 체크
                for(int j=0; j<N; j++){

                    if(arr[i][j] == 0){
                        if(colCheck == K){
                            count++;
                        }
                        colCheck =0;
                    }
                    else {
                        colCheck +=1;
                    }
                }
                if(colCheck == K){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
