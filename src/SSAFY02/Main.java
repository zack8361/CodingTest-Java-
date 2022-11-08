package SSAFY02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int testcase =0; testcase<N; testcase++){
            int num = sc.nextInt();
            int[][] A = new int[num][num];
            int num2= sc.nextInt();
            for(int i=0; i<num; i++) {
                for (int j = 0; j < num; j++) {
                    A[i][j] = sc.nextInt(); //A배열에 정수 입력
                }
            }
            int max =0;
            // 패턴 만큼 탐색 한다
            for(int a=0; a<num-num2+1; a++){
                for(int b=0; b<num-num2+1; b++){
                    int sum =0;
                    //2 x 2만큼
                    for(int c=0; c<num2; c++) {
                        for (int d = 0; d < num2; d++) {
                            sum += A[a + c][b + d];
                        }
                    }
                    max = Math.max(max,sum);
                }
            }
            System.out.println(max);
        }
    }
}