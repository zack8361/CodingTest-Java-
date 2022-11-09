package SSAFY03;

import java.util.Scanner;

public class SWEA1986re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            int odd =0;
            int add =0;

            for(int j=0; j<=num; j++){
                if(j%2==0){
                    odd+=j;
                }
                else if(j%2==1){
                    add+=j;
                }
            }
            System.out.println(odd-add);
        }
    }
}
