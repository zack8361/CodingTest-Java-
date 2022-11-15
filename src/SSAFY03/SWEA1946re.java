package SSAFY03;

import java.util.Scanner;

public class SWEA1946re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int k = 1; k <=T; k++) {
            int N = sc.nextInt();
            String[] s = new String[N];
            int[] n = new int[N];

            for(int i=0; i<N; i++){
                s[i] = sc.next();
                n[i] = sc.nextInt();
            }

            int count = 0;
            for(int i=0; i<N; i++){
                for(int j=0; j<n[i]; j++){
                    System.out.print(s[i]);
                    count++;
                   if(count ==10){
                       System.out.println();
                       count =0;
                   }
                }
            }

        }
    }
}
