package SSAFY02;

//10개의 수를 입력받아서, 최대의 수와 최소의 수를 제외한 나머지의 평균값을 출력하는 프로그램
//소수점 첫째 자리에서 반올림한 정수를 출력한다.
//Math.min(min,num) 이라는 메소드 활용. num  중에서 가장 작은 수 추출
//Math.max(max,num) 이라는 메소드 활용. num 중에서 가장 큰 수 추출
import java.util.Scanner;

//가장 첫 줄에는 테스트 케이스의 개수 t 가 주어지고, 그아래로 각 테스트 케이스가 주어진다.
public class SWEA1984 {
    public static void main(String[] args) {
        Scanner kong = new Scanner(System.in);
        int testcase =kong.nextInt();

        for(int i=0; i<testcase; i++){
            int min = 100; //min 은 입력들어올수 있는 가장 큰 값을 줘야한다
            int max = 0; //max 는 가장 작은 값
            int sum =0;
            for(int j=0; j<10; j++){
                int num = kong.nextInt();
                min = Math.min(min,num); // 입력한것 중 가장 작은 값을 min 에 저장
                max = Math.max(max,num);
                sum += num;
            }
            System.out.println((sum-(min +max))/8);
            //System.out.printf("#%d %d\n", t, Math.round(((sum - min - max) * 1.0) / 8
            //소수점 1자리에서 반올림 해주기 위해서 전체 합에 1.0 곱한뒤 8로 나누고 반올림한다.
        }
    }

}
