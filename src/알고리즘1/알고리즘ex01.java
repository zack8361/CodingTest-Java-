package 알고리즘1;

//세수의 최대값 구하기
import java.util.Scanner;

public class 알고리즘ex01 {
    public static void main(String[] args) {

        Scanner kong = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");
        int max =0;
        for(int i=0; i<3; i++){
            int num = kong.nextInt();
            if(max<num){
                max = num;
            }
        }
        System.out.println(max);


    }
}
