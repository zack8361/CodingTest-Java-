package SSAFY03;

import java.util.Scanner;

public class SWEA1989re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int tc=0; tc<N; tc++) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            int flag = 0;
            for (int i = 0; i < arr.length/2; i++) {
                if(arr[i]==arr[arr.length-1-i]){
                    flag =1;
                }
            }
            if(flag ==0){
                System.out.println("0");
            }
            else {
                System.out.println("1");
            }
        }
    }
}
