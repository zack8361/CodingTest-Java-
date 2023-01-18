package KongBlog;

import java.util.ArrayDeque;

/**
 * 행렬과 연산 (Programmers.lv4) -> 너무어려움(이거 풀줄알면 코테 다통과할정도)
 */
public class Programmers118670 {
    public static void main(String[] args) {
        int[][] rc = {{1,2,3},{4,5,6},{7,8,9}};
        String[] operations = {"Rotate"};
        System.out.println(solution(rc,operations));
    }
    private static int[][] solution(int[][] rc, String[] operations) {

        int[][] answer = new int[rc.length][rc[0].length];
        ArrayDeque<Integer> left = new ArrayDeque<>();
        ArrayDeque<Integer> right = new ArrayDeque<>();
        ArrayDeque<ArrayDeque<Integer>> mid = new ArrayDeque<>();

        for(int i=0; i<rc.length; i++) {
            left.addLast(rc[i][0]); //첫번째 글짜 세개 넣어준다.
            ArrayDeque<Integer> midQueue = new ArrayDeque<>();
            for (int j = 1; j < rc[0].length - 1; j++) {
                midQueue.addLast(rc[i][j]); //마지막 전까지 넣어준다.
            }
            mid.addLast(midQueue);
            right.addLast(rc[i][rc[0].length - 1]);
        }

        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("ShiftRow")){
                left.addFirst(left.pollLast());
                right.addFirst(right.pollLast());
                mid.addFirst(mid.pollLast());
            }
            else {
                mid.peekFirst().addFirst(left.pollFirst());
                right.addFirst(mid.peekFirst().pollLast());
                mid.peekLast().addLast(right.pollLast());
                left.addLast(mid.peekLast().pollFirst());
            }
        }

        for(int i=0; i<answer.length; i++){
            answer[i][0] = left.pollFirst();
            ArrayDeque<Integer> midQueue = mid.pollFirst(); //midQueue = mid.pollFirst()미드에 박혀있는걸 한개씩 빼온다.
            for(int j=1; j<answer[0].length-1; j++){
                answer[i][j] = midQueue.pollFirst(); //answer[i][j] = midQueue.pollFirst()해서 한개씩 빼온다.
            }
            answer[i][answer[0].length-1] = right.pollFirst(); //각행의 마지막 원소값은 right 에서 한개씩 빼온다.
        }
        return answer;
    }
}
