package 알고리즘2반복문;

import java.util.Scanner;

//*를  n 개 출력하되 w개마다 줄바꿈 하기.
public class while05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*을 n개 출력하되 w개 마다 줄바꿈하기");
        System.out.print("n값 : ");
        int n = sc.nextInt();
        System.out.print("w값 : ");
        int w = sc.nextInt();

        int count =0;
        for(int i=0; i<n; i++){
            System.out.print("*" + " ");
            count++;
            if(count == w){
                System.out.println();
                count = 0;
            }
        }
    }
}
