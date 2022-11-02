package SSAFY02;

import java.util.Scanner;
//1.스도쿠 게임 알고리즘
//2.퍼즐은 모두 숫자로 채워진 상태이다
//3.입력으로 주어지는 퍼즐의 모든 숫자는 1이상 9이하의 정수이다.
//4.입력으로 9 x 9 퍼즐의 숫자들이 주어졌을 떄, 겹치는 숫자가 없을 경우, 1을 정답으로 출력하고 그렇지 않을경우 0을 출력한다.

//풀이 방법
//1.입력받은 배열에서 순서대로, 행체크,열체크,격자체크를 하면된다.
//2.행체크는 각 줄마다 arr 배열에서 0이 있으면 false
//3.열체크도 동일
//4.격자체크도 동일

public class SWEA1974풀지못함 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int testcase = kong.nextInt();

        int[][] arr = new int[9][9];  // 9x9 짜리 배열 선언
        for(int tc=0; tc<testcase; tc++) {
            //배열을 입력받는다.
            boolean sign = true;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = kong.nextInt();
                }
            }

            //행체크
            for(int i=0; i<9; i++){
                int[] check = new int[9]; //행을 체크하기위한 수단으로 배열을 하나 선언 해준다.
                for(int j=0; j<9; j++){
                    check[(arr[i][j])-1]++;
                }
                for(int a=0; a<9; a++){
                    if(check[a]==0){
                        sign = false;
                        break;
                    }
                }
            }

            //열체크
            for(int i=0; i<9; i++){
                int[] check = new int[9];
                for(int j=0; j<9; j++){
                    check[(arr[j][i])-1]++;
                }
                for(int a=0; a<9; a++){
                    if(check[a] ==0){
                        sign = false;
                        break;
                    }
                }
            }
            if(sign ==true){
                System.out.println("1");
            }
            else if (sign ==false){
                System.out.println("0");
            }

        }
    }
}