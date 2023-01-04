package Programmers1;

public class SosuFind {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;

        int count = 0;
        for(int i=2; i<=n; i++){
            count = 0;
            for(int j=1; j<=n; j++){
                if(j>i){
                    break;
                }
                if(i%j ==0){
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count==2){
                answer++;
            }
        }
        return answer;
    }
}
