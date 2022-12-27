package Programmers2;

public class correctParentheses {
    public static void main(String[] args) {
        String s = "((()";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = true;

        char[] str = s.toCharArray();

        int count = 0;
        int count2 = 0;

        if(str[0] == ')'){
            return false;
        }
        if(str[str.length-1] == '('){
            return false;
        }
        for(int i=0; i<str.length; i++){

            if(str[i] =='(') {
                count++;
            }else if(str[i] == ')'){
                count2++;
            }
            if(count2>count) {
                return false;
            }

        }
        if(count2!=count){
            return false;
        }else{
            return true;
        }
    }
}
