package BAEKJOON정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysortAlp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }

        //정렬 의 기준을 정해주는것
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //만약 들어온 두수의 길이가 같다면
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                    //사전순으로 비교하여 출력하는 메서드 입력
                } else {
                    //만약 들어온 두수의 길이가 같지 않다면
                    return o1.length() - o2.length();
                    //더 짧은 것부터 출력.
                }
            }
        });
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
