package 알고리즘4이분탐색;


import java.util.Arrays;
import java.util.Scanner;
//나무자르기 문제 Silver2
//배열 정렬후 최소값(0) + 최대값(arr[arr.length-1] /2 하며 M 값과 비교하여 +/- 해주며 찾는다
public class binEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //배열의 개수
        int M = sc.nextInt(); //결과 값 이 되어야하는수
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        } //배열에 수 입력
        Arrays.sort(arr);
        int low =0;
        int high = arr[arr.length-1];

        while (low<=high){
            int mid = (low+high)/2;
            long sum =0;
            for(int i=0; i<N; i++){
                if(arr[i] > mid){
                    sum+=arr[i] - mid;
                }
            }
            if(M<=sum){
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        System.out.println(high);

    }
}




