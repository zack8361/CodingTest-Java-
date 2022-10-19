package Array;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int num = kong.nextInt(); //내가 입력하는 Num 의 값
        String[] Array = new String[num]; //입력한 num 만큼의 String 으로 된 배열 생성

        for(int i=0; i<Array.length; i++){
            Array[i] = kong.next();
        }
        kong.close();

        for(int i=0; i<Array.length; i++){
            int count =0;
            int sum = 0;
            for(int j=0; j<Array[i].length(); j++) {
                if (Array[i].charAt(j) == 'o') {
                    count++;
                    sum += count;
                } else {
                    count = 0;

                }
            }

            System.out.println(sum);
        }
    }
}
