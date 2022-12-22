package Programmers;

public class difficult5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(solution(a,b));
    }

    private static int solution(int[] a, int[] b) {
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum +=a[i]*b[i];
        }
        return sum;
    }
}
