package KongBlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    줄서는 방법 프로그래머스 lv.3
 */
public class Programmers12936 {
    public static void main(String[] args) {
        int n = 3;
        long k = 1;
        System.out.println(solution(n,k));
    }

    private static int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> people = new ArrayList<>();
        int factorial = 1;
        int index = 0;
        //팩토리얼값 6으로 만들어주고
        //people List 에 1,2,3(Index :0,1,2) 순으로 삽입

        for(int i=1; i<=n; i++){
            factorial*=i;
            people.add(i);
        }
        //팩토리얼값 6으로 만들어주고
        //people List 에 1,2,3(Index :0,1,2) 순으로 삽입
        k--;
        //인덱스와 바로 매칭시키기위해서 k값을 1빼준다.
        while (n>0) {
            factorial /= n;
            int value = (int) k / factorial;
            answer[index++] = people.get(value);
            people.remove(value);
            k %= factorial;
            n--;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
