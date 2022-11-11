package Programmers;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        Sol4 s = new Sol4();
        System.out.println(s.solution(ingredient));
    }

}


class Sol4{
    public int solution(int[] ingredient){
        int answer = 0;
        for(int i=0; i<ingredient.length-3; i++){
            if(ingredient[i]==1 &&ingredient[i+1]==2 &&ingredient[i+2]==3 &&ingredient[i+3]==1){
                answer++;
            }
        }
        return answer;
    }

}