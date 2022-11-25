package 알고리즘2반복문;

import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=4; i++){

            for(int j=4; j>i; j--){
                System.out.print(" ");
            }

            for(int j=1; j<=(i-1)*2+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
