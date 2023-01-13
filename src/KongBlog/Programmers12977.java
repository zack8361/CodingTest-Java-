package KongBlog;

import javax.swing.*;

/**
 * 소수 만들기 (Programmers.lv1)
 */

public class Programmers12977 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    check(sum);
                    if(check(sum)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private static boolean check(int sum) {
        int cnt = 0;
        for(int i=2; i<sum; i++){
            if(sum%i==0){
                cnt++;
            }
        }
        if(cnt!=0){
            return false;
        }
        else {
            return true;
        }
    }
}
