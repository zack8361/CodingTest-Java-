package 인프런1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int totalCnt = 0;
        for(int i=2; i<=N; i++){
            count=0;
            for(int j=1; j<=N; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count ==2){
                totalCnt++;
            }
        }
        System.out.println(totalCnt);
    }
}
