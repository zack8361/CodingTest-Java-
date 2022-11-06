package 알고리즘1;

//세수의 최댓값 구하기
public class 알고리즘ex02 {


    public static void main(String[] args) {

        System.out.println(max(1,2,3));
        //max 함수 호출

    }
    //값을 가지고 max 함수로 들어온다
    private static int max(int a, int b, int c) {
        int max = a;

        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        //if 문을 돌고 호출 한곳으로 max 값 리턴
        return max;
    }
}
