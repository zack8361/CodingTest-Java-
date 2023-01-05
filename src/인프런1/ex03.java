package 인프런1;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            arr2[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            if(arr[i] == arr2[i]){
                sb.append("D");
            }
            else if(arr[i] ==1 &&arr2[i]==3){
                sb.append("A").append('\n');
            }
            else if(arr[i] ==2 &&arr2[i] ==1){
                sb.append("A").append('\n');
            }
            else if(arr[i] ==3 && arr2[i] ==2){
                sb.append("A").append('\n');
            }
            else if(arr[i] ==3 &&arr2[i] ==1){
                sb.append("B").append('\n');
            }
            else if(arr[i] ==1 && arr2[i] ==2){
                sb.append("B").append('\n');
            }

        }
        System.out.println(sb);

    }
}
