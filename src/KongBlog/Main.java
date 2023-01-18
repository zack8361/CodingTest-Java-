package KongBlog;

import java.util.ArrayList;
import java.util.List;

/**
 * 줄서는 방법 프로그래머스 레벨 3단계
 * 모든 경우의수 뽑는 순열 X 규칙 찾아 적용 o
 */
public class Main {
    public static void main(String[] args) {
        int n = 3;
        long k = 5;
        System.out.println(solution(n,k));
    }

    private static int[] solution(int n, long k) {
        int[] answer =new int[n];
        int factorial = 1;

        List<Integer> people = new ArrayList<>();
        for(int i=1; i<=n; i++){
            factorial*=i;
            people.add(i);
        }
        k--;
            int index =0;
            while (n>0) {
                factorial /= n;
                int value = (int) k / factorial;
                answer[index++] = people.get(value);
                people.remove(value);
                k%=factorial;
                n--;
            }

        return answer;

    }
}
