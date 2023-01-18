package KongBlog;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        //queue 는 먼저 들어온 데이터가 앞에 박히고
        //삭제 될때도 먼저 들어온 데이터가 먼저 나간다.

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

    }
}
