package 알고리즘1;

import java.util.Scanner;

public class 알고리즘ex04 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int max =0;
        int min =0;
        int mid =0;
        for(int i=0; i<3; i++){
            int num = kong.nextInt();
            if(max<num){
                max = num;
            }
            else if(min>num){
                min = num;
            }
            else {
                mid = num;
            }
        }

        System.out.println(mid);
    }
}
