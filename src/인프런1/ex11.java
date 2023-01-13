package 인프런1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][5];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int answer = 0;
        int count = 0;
        int max = 0;
        for(int i=0; i<N; i++){
            count = 0;
            for(int j=0; j<N; j++){
                for(int k=0; k<5; k++){
                    if(arr[i][k] ==arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if(count>max){
                max = count;
                answer = i+1;
            }
        }
        System.out.println(answer);
    }
}
