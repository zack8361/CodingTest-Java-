package SSAFY03;

import java.util.Scanner;

public class SWEA15230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int testcase = 0; testcase<=N; testcase++){
            String str = sc.next();
            int count =0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) ==(97+i)){
                    count++;
                }
                else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
