package algorithm.inflearn.intro.twoPointer;

import java.util.Scanner;

// 3-6. 최대 길이 연속 부분 수열
public class MaxDistanceContinuityNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0, cnt = 0, lt = 0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>m){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }
        System.out.println(result);
    }
}
