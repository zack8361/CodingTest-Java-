package SSAFY03;

import java.util.Scanner;

public class SWEA1976re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc =1; tc<=T; tc++){
            int month = sc.nextInt();
            int day = sc.nextInt();

            int month2 =sc.nextInt();
            int day2 = sc.nextInt();
            int total =0;
            if(day2 + day > 59){
                total = month2+ month +1;
            }
            else if(month2 + month == 12){
                total = 13;
            }
            else {
                total = month2 + month;
            }
            System.out.println("#" + tc + " " + total%12 + " " + (day2+day)%60);
        }
    }
}
