package KongBlog;

import java.util.Arrays;


/**
 *  순열(완전탐색) : n개 중에서 r개를 순서있게 뽑기
 *  시간 복잡도:0(n!);
 */
public class 순열Ex {
    public static void main(String[] args) {
        int n = 3; //배열의 길이
        int[] arr = {1, 2, 3}; //순열을 만들 배열
        int[] output = new int[n]; //순열 출력을 위한 배열
        boolean[] visited = new boolean[n]; //중복해서 뽑지 않기 위해 방문했는지를 체크하는 배열

        System.out.println("----------------------1.DFS-------------------------");
        dfs(arr, output, visited, 0, n, 3); //r=3, 3개를 뽑을것
    }
    //depth = 깊이 r = 몇개를 뽑을것인지.
    private static void dfs(int[] arr, int[] output, boolean[] visited, int depth, int n, int r){

        if(depth == r){
            print(output,r);
            return;
        }

        for(int i=0; i<n; i++){
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = arr[i];
                dfs(arr,output,visited,depth+1,n,r);
                visited[i] = false;
            }
        }
    }

    private static void print(int[] output, int r) {
        System.out.println(Arrays.toString(output));
    }
}