package SSAFY;


import java.util.Scanner;

//홀수만 더하기// 배열
public class ex01 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num  = kong.nextInt();
        int[] Array = new int[num];

        for(int i=0; i<Array.length; i++){
            int sum =0;
             for(int j=0; j<10; j++){
                 int number = kong.nextInt();
                 if(number%2 ==1){
                     sum+= number;
                 }
             }
             Array[i] = sum;
        }
        for(int i=0; i<Array.length; i++){
            System.out.println(Array[i]);
        }

    }

}