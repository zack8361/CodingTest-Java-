package SSAFY;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int number = kong.nextInt();
        int[] Array = new int[number];

        for(int i=0; i<Array.length; i++){
            int num1 = kong.nextInt();
            int num2 = kong.nextInt();

            if(num1<num2){
                System.out.println("<");
            }
            else if(num1 ==num2){
                System.out.println("=");
            }
            else if (num1>num2) {
                System.out.println(">");
                
            }
        }
    }
}
