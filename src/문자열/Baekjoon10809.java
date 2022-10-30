package 문자열;

import java.util.Scanner;

//String 클래스의 indexOf() 메서드를 활용
//indexOf() = 특정 문자의 위치를 반환하며, 존재하지 않을 경우 -1을 반환하는 메서드이다.
public class Baekjoon10809 {
    public static void main(String[] args) {

        Scanner kong = new Scanner(System.in);
        String word = kong.next();
        for(char i = 'a'; i<'z'; i++){
            System.out.println(word.indexOf(i) + " ");

        }
    }
}
