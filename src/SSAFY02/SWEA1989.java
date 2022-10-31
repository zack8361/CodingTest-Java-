package SSAFY02;

import java.util.Scanner;

//회문 판별 알고리즘
//1.문자열을 입력받아 배열로 바꾼다.
//2.문자열의 길이의 반만큼 FOR 문을 돌린다.
//3.FLAG 를 0으로 맞춘다.
//4.끝자리와 첫자리의 문자가 다르면 회문이 아니기 대문에 FLAG =1 로 바꾼다.
//5. FLAG 를 통해서 회문을 판별한다.


public class SWEA1989 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        char[] arr = new char[10000];
        for(int i=0; i<num; i++){
            int flag = 0; //회문인지 아닌지 판별하기 위한 변수 flag
            String s = kong.next(); // 문자열을 입력받는다.
            arr =s.toCharArray(); //입력받은 문자열을 배열로 변환한다.
            for(int j=0; j<s.length()/2; j++){
                if(arr[i] != arr[s.length()-i-1])
                    flag =1;
                //끝자리와 첫자리의 문자가 다르면 회문이 아니기 때문에 FLAG 를 1로 변경
            }
            if(flag == 0){
                //FLAG ==0 일때 회문이기 때문에 1출력
                System.out.println("1");
            }
            else {
                //아닐시 FLAG ==1 0출력
                System.out.println("0");
            }

        }
    }
}
