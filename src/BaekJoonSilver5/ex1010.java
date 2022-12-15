package BaekJoonSilver5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

         st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            sb.append(binSearch(A,B[i])).append(" ");
        }
        System.out.println(sb);
    }

    private static int binSearch(int[] a, int i) {
        int start = 0;
        int end = a.length-1;
        int mid;
        while (start<=end){

            mid = (start+end)/2;
            if(a[mid] == i){
                return 1;
            }
            else if(a[mid]<i){
                start = mid + 1;
            }
            else if(a[mid]>i){
                end = mid - 1;
            }
        }
        return 0;
    }
}
