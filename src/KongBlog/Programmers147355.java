package KongBlog;

import java.util.Arrays;

/**
 * 크기가 작은 부분 문자열
 */
public class Programmers147355 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(solution(t,p));
    }

    private static int solution(String t, String p) {
        int result = 0;
        long num = Long.parseLong(p);
        int len = p.length();
        for (int i = 0; i < t.length() - len + 1; i++) {
            long diff = Long.parseLong(t.substring(i, (i + len)));
            if (diff < num) {
                result++;
            }
        }
        return result;
    }
}
