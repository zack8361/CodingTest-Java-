package SSAFY02;

import java.util.Scanner;

//달팽이 , 상하 좌우 로 틀어서 배열 입력하는 알고리즘
public class SWEA1954 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int tc = kong.nextInt();

        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        for(int t=1;t<tc; t++){
            int n = kong.nextInt();
            int num =1;
            int[][]arr = new int[n][n];
            int x =0;
            int y=0;
            int dir =0;

            while (num<=n*n){
               arr[x][y] = num++;
               x += dx[dir];
               y += dy[dir];

               if(x<0 ||y<0 ||x>=n || y>=n||arr[x][y]!=0){

                   x-=dx[dir];
                   y-=dy[dir];

                   dir = (dir+1)%4;

                   x += dx[dir];
                   y += dy[dir];
               }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }

    }
}
