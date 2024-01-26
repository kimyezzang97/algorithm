package algorithm.inflearn.intro.DFS;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

// 8-2. 바둑이 승차(DFS) 부분 집합
public class PuppyTaking {
    static int answer = Integer.MIN_VALUE, c, n, cnt=0;
    public void DFS(int L, int sum, int[] arr){
        if(sum>c) return;
        if(L==n){
            answer=Math.max(answer, sum);
            System.out.println("sum : " + sum);

        } else{
            
            DFS(L+1, sum+arr[L], arr);

            DFS(L+1, sum, arr);

        }
    }

    public static void main(String[] args) {
        PuppyTaking T = new PuppyTaking();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt(); // 트럭 최대 적재 무게
        n = sc.nextInt(); // N 마리의 바둑이들
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
