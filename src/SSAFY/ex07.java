package SSAFY;

import java.util.HashMap;
import java.util.Scanner;


//문자를 숫자로 변환 하는 방법//
public class ex07 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        String alp = kong.next();
        for(int i=0; i<alp.length(); i++){
            System.out.println(((int)alp.charAt(i)-64) + " ");
            //알파벳을 숫자로 변환하기 위해서 ((int)alp.charAt(i))를 한다.
            //A는 65부터 시작하기때문에 i-64 를 해줌으로써 1부터 시작하게 한다.
        }

    }
}
