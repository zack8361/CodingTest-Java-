package SSAFY03;

import java.util.Scanner;

public class SWEA15612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] arr;
        int count;
        int count2;
        int flag;
        for(int testcase=0; testcase<N; testcase++) {
            arr = new char[8][8];

            for (int i = 0; i < 8; i++) {
                String tmp = sc.next();
                flag =1;
                for (int j = 0; j < tmp.length(); j++) {
                    arr[i][j] = tmp.charAt(j);
                }
            }

            for(int i=0; i< arr.length; i++){
                count = 0;
                count2 = 0;
                for(int j=0; j<arr[i].length; j++){
                    if(arr[i][j] == '0'){
                        count++;
                    }
                    if(arr[j][i] == '0'){
                        count2++;
                    }
                    if(count != 1 || count2 != 1){
                        flag =0;
                    }
                }
            }
        }
    }
}

