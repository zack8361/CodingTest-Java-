package Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] arr ={1,2,3,4};
        System.out.println(solution(arr));
    }

    private static double solution(double[] n) {
        double sum = 0;
        for(int i=0; i<n.length; i++){
            sum += n[i];
        }
        return sum/n.length;
    }

}
