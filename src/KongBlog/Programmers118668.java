package KongBlog;

public class Programmers118668 {
    public static void main(String[] args) {

    }
    class Solution {
        public int solution(int[] queue1, int[] queue2) {
            ArrayDeque<Integer> deque1 = new ArrayDeque<>();
            ArrayDeque<Integer> deque2 = new ArrayDeque<>();
            long sum = 0;
            long sum2 = 0;

            for(int i=0; i<queue1.length; i++){
                deque1.addLast(queue1[i]);
                sum+=queue1[i];
            } //12

            for(int i=0; i<queue2.length; i++){
                deque2.addLast(queue2[i]);
                sum2+=queue2[i];
            }//16

            int count = 0;
            int end = queue1.length*4;
            while (sum!=sum2){
                count++;
                if(sum>sum2){
                    int value = deque1.pollFirst();
                    sum-=value;
                    sum2+=value;
                    deque2.addLast(value);
                }
                else {
                    int value = deque2.pollFirst();
                    sum+=value;
                    sum2-=value;
                    deque1.addLast(value);
                }
                if(count>end){
                    return -1;
                }

            }

            return count;
        }
    }
}
