package SSAFY02;

import java.lang.reflect.Array;
import java.util.Scanner;
//파스칼 삼각형이란
//1. 첫번째 줄은 항상 숫자 1이다.
//2. 두번째 줄부터 각 숫자들은 자신의 왼쪽과 오른쪽 위의 숫자 합으로 구성된다.
//3. 해결방식 2차원 배열 이용.
public class SWEA2005 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        for(int i =0; i<num; i++){
            int num2 = kong.nextInt();
            int[][] Array = new int[num2][num2];
            for(int k=1; k<num2; k++){   //행
                for(int j=1; j<=k; j++){   //열
                    if(k == 0 || j==k){ //0번째 행이거나 열의인덱스 와 행의 인덱스가 같을때 모두 1로 변환
                        Array[k][j] = 1;
                    }
                    else {
                        Array[k][j] = Array[k-1][j-1] + Array[k-1][j];
                    }
                    System.out.print(Array[k][j]);
                }
                System.out.println();

            }
        }
    }
}