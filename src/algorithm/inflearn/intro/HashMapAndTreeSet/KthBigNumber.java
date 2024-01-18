package algorithm.inflearn.intro.HashMapAndTreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// 4-5. K번째 큰 수
public class KthBigNumber {
    public static void main(String[] args) {
        KthBigNumber T = new KthBigNumber();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr, N, K));
    }

    public int solution(int[] arr, int n, int k){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }
}
