package SSAFY03;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1983 {
    public static void main(String[] args) {
        String[] grade = {"A+","A","A-","B+","B","B-","C+","C","C-","D"};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc =0; tc<T; tc++){
            int N = sc.nextInt(); //사람수
            int K = sc.nextInt(); //선택할 K

            double arr[] = new double[N];
            int cnt =0;

            for(int i=0; i<N; i++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();

                arr[i] = A * 0.35 + B *0.45 + C *0.2;
            }
        }
    }
}
