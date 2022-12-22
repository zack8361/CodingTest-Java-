package Programmers;

public class difficult2 {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;

        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum+=numbers[i];
        }
        answer = 45-sum;
        return  answer;
    }
}
