package 알고리즘1;

//세수의 최소값 구하기
public class 알고리즘ex03 {
    public static void main(String[] args) {

        System.out.println(min3(10,20,3));
    }

    private static int min3(int a, int b, int c) {
        int min = a;
        if(min>b){
            min = b;
        }
        if(min>c){
            min = c;
        }
        return min;
    }
}
