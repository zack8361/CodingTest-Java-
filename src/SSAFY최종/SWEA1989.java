package SSAFY최종;

import java.util.Scanner;

public class SWEA1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] arr;
        for(int j=0; j<N; j++){
            String S = sc.next();
            arr = S.toCharArray();
            int flag =0;
            for(int i=0; i<S.length()/2; i++){
                if(arr[i]!= arr[arr.length-1-i])
                    flag=1;
            }
            if(flag ==0){
                System.out.print("1");
            }
            else{
                System.out.println("o");
            }
        }
    }
}
