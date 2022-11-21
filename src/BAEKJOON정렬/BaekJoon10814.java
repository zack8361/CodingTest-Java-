package BAEKJOON정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class BaekJoon10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++) {
            arr[i][0] = sc.next(); //나이
            arr[i][1] = sc.next(); //이름
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
                //나이가 작은 순으로 정렬
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
