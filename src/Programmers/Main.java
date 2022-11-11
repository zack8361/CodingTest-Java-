package Programmers;

public class Main {

    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        Solution s =  new Solution();

        System.out.println(s.solution(food));
    }

}
class Solution{
    public String solution(int[] food){
        String answer ="";
        for(int i=1; i<food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }
        String answer2 ="";

        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer2 = i +answer2;
            }
        }

        return answer + "0" + answer2;
    }
}
