package SSAFY최종;

//12-45-78-

import java.util.Scanner;

public class SWEA1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            String tmp = String.valueOf(i);
            if(tmp.contains("3") || tmp.contains("6")||tmp.contains("9")){
                System.out.print("-");
            }

            else {
                System.out.print(i+" ");
            }
        }
    }
}
