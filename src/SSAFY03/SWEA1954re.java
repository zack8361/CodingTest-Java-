package SSAFY03;

import java.util.Scanner;

public class SWEA1954re {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int T = kong.nextInt();
        //우하 좌상
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int tc=1; tc<=T; tc++){
            int N = kong.nextInt();
            int [][] map = new int[N][N];
            int x = 0; //x방향
            int y = 0; //y 방향
            int dir = 0; //방향 설정 할때 쓰는것
            int num = 1;

            while(num <=(N*N)){
                map[x][y] = num++; //하나씩 증가시키기
                x+=dx[dir];
                y+=dy[dir];
                if(x>N-1 || x<0 || y>N-1 ||y<0 || map[x][y] != 0){
                    x-=dx[dir];
                    y-=dy[dir];
                    //원래 대로 도려주고
                    dir = (dir+1)%4;
                    x+=dx[dir];
                    y+=dy[dir];
                }
            }
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        }
    }
}
