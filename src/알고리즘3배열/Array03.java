package 알고리즘3배열;

import java.util.Scanner;

//솟수 구하기 주말동안 풀어오기
public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0;
        for(int i=2; i<1000; i++){
            int j;
            for(j=2; j<i; j++){
                count++;
                if(i%j  == 0){
                    break;
                }
            }
            if(i == j){
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
