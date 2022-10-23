package SSAFY;

import java.util.Scanner;

//입력받은 숫자 반복문을 사용하여 거꾸로 출력하기.
public class ex11 {
    public static void main(String[] args) {

        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt();
        for(int i=num; i>-1; i--){
            System.out.print(i + " ");
        }
    }
}
