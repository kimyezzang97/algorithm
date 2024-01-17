package algorithm.inflearn.intro.twoPointer;

import java.util.Scanner;

// 3-4. 연속 부분 수열
public class ContinuitySequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int sum = 0;
        int lt = 0;

        for(int rt=0; rt<n; rt++){
            sum += arr[rt];
            if(sum==m) result++;
            while(sum>=m){
                sum -= arr[lt++];
                if(sum==m) result++;
            }
        }

        System.out.println(result);
    }
}
