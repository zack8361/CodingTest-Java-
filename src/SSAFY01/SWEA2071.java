package SSAFY01;

import java.util.Scanner;

public class SWEA2071 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1; i<=T; i++){
            double sum = 0;
            for(int j=0; j<10; j++){
                int num = sc.nextInt();
                sum+= num;
            }

            System.out.printf("%.0f\n",sum/10);
        }



    }
}
