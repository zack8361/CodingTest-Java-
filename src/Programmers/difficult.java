package Programmers;

public class difficult {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        System.out.println(solution(absolutes,signs));
    }

    private static int solution(int[] absolutes, boolean[] signs) {

        int sum = 0;
        for(int i=0; i<absolutes.length; i++) {
            if(signs[i] == true){
                sum+=absolutes[i];
            }
            else {
                sum -=absolutes[i];
            }
        }
        return sum;

    }
}
