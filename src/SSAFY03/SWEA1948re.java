package SSAFY03;

import java.util.Scanner;

public class SWEA1948re {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);

        int[]  date = {31,28,31,30,31,30,31,31,30,31,30,31};
        int T = kong.nextInt();
        for(int tc =1; tc<=T; tc++){

            int A = kong.nextInt();
            int B = kong.nextInt();

            int C = kong.nextInt();
            int D = kong.nextInt();

            int sum = 0;
            for(int i=0; i<A; i++){
                sum+=date[i];
            }
            int result = sum + B;

            int sum2 = 0;
            for(int i=0; i<C; i++){
                sum2+=date[i];
            }
            int result2 = sum2 + D;

            System.out.println("#"+tc + " " +(result2 - result+1));
        }
    }
}
