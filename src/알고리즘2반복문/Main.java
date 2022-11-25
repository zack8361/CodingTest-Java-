package 알고리즘2반복문;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            for(int j=4; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
