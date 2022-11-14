package SSAFY03;

import java.util.Scanner;

public class SWEA1974 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc =0; tc<T; tc++){
            int[][] map = new int[9][9];
            boolean sign = true;

            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    map[i][j] = sc.nextInt();
                }
            }
            //행체크
            for(int i=0; i<9; i++){
                int[] arr = new int[9];
                for(int j=0; j<9; j++){
                    arr[map[i][j]-1]++;
                }
                for(int j=0; j<9; j++){
                    if(arr[j] == 0){
                        sign = false;
                        break;
                    }
                }
            }
            //열체크
            for(int i=0; i<9; i++){
                int[] arr = new int[9];
                for(int j=0; j<9; j++){
                    arr[map[j][i]-1]++;
                }
                for(int j=0; j<9; j++){
                    if(arr[j] == 0){
                        sign =false;
                        break;
                    }
                }
            }

            if(sign == true){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }



    }
}

