package 알고리즘3배열;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        int count =0; //나눗셈의 횟수
        int ptr = 0; //찾은 소수의 개수
        int[] prime = new int[500]; //소수를 저장하는 배열

        prime[ptr++] = 2; //prime 배열에 소수:2 라는 숫자를 넣음으로써 / 소수의 개수 1증가 시킨다
        System.out.println(Arrays.toString(prime));
        System.out.println(ptr);


    }
}
