package 인프런1;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int count = 0;
        for(int i=0; i<N; i++){
            if(arr[i] ==1){
                count++;
                result+=count;
            }
            else {
                count = 0;
            }
        }
        System.out.println(result);
    }
}
