package SSAFY03;

import java.util.Scanner;

public class SWEA1945re {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int T = kong.nextInt();

        for(int i=1; i<=T; i++){
            int num = kong.nextInt();

            int a =0;
            int b=0;
            int c=0;
            int d=0;
            int e=0;

            while (true){

                if(num%2 ==0){
                    num = num/2;
                    a++;
                }
                if(num%3 ==0){
                    num = num/3;
                    b++;
                }
                if(num%5 ==0){
                    num = num/5;
                    c++;
                }
                if(num%7 ==0){
                    num = num/7;
                    d++;
                }
                if(num%11 ==0){
                    num = num/11;
                    e++;
                }
                if(num == 1){
                    break;
                }
            }
            System.out.print("#" + i + " "+a+" "+b+" "+c+" "+d+" "+e +'\n');

        }
    }
}
