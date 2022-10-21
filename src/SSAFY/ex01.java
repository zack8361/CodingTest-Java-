package SSAFY;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();

        int[] Array = new int[10];

        for(int i=0; i<num; i++){
            int sum =0;
            for(int j=0; j<Array.length; j++){
                int number = kong.nextInt();
                if(number%2 ==1){
                    sum += number;
                }
            }
        }

    }

}
