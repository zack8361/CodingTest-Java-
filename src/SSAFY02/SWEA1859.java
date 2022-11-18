package SSAFY02;


import java.util.Scanner;

//백만 장자 프로젝트
public class SWEA1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case =1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;
            long sum = 0;
            int np =0;
            for (int i = N-1; i >=0; i--) {
                if (max < arr[i]) { //최대값인 경우
                    max = arr[i];
                }
                else {
                    np = max - arr[i];
                    sum += np;
                }
            }

            System.out.println("#" +test_case+" "+sum);
        }
    }
}