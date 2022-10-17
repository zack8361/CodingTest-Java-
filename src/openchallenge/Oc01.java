package openchallenge;


import java.util.Random;
import java.util.Scanner;

public class Oc01 {
    public static void main(String[] args) {
        int low = 0;
        int high = 99;
        Scanner kong = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);


        System.out.println("수를 결정하였습니다. 맞추어 보세요");
        while (true){
        int user = kong.nextInt();
        if(user<num) {
            low = num;
            System.out.println("더높게");
            }
        else if(user>num){
            high = num;
            System.out.println("더낮게");
        }
        else {
            System.out.println("정답입니다");
            break;
        }
        }
    }
}