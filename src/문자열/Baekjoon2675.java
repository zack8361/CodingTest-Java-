package 문자열;

import java.util.Scanner;

public class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        for(int i=0; i<num; i++){
            int num2 = kong.nextInt();
            String alp = kong.next();
           for(int j=0; j<alp.length(); j++){
               for(int k =0; k<num2; k++) {
                   System.out.print(alp.charAt(j));
               }
           }

        }
    }
}
