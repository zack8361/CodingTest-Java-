package BAEKJOON정렬;

import java.util.*;

public class Array2sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][]map = new int[N][2];
        for(int i=0; i<N; i++){
            map[i][0] = sc.nextInt(); //1번째 열 입력
            map[i][1] = sc.nextInt(); //2번째 열 입력
        }
        Arrays.sort(map, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(map[i][0] +" "+map[i][1]);
        }

    }
}
