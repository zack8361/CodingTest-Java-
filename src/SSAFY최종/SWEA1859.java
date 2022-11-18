package SSAFY최종;

import java.util.Scanner;

//백만장자 프로젝트
public class SWEA1859 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int T = kong.nextInt();
        for(int tc=1; tc<=T; tc++){
            int num = kong.nextInt();
            int[] arr = new int[num];


            for(int i=0; i<num; i++){
                arr[i] = kong.nextInt();
            }

            int max = 0;
            long sum =0;
            for(int i=num-1; i>=0; i--) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                else {
                    int np = max - arr[i];
                    sum+=np;
                }
            }
            System.out.println(sum);
        }
    }
}
