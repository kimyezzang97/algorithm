package algorithm.inflearn.intro.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 6-10. 마구간 정하기 (결정 알고리즘)
public class Stall {
    public static void main(String[] args) {
        Stall T = new Stall();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(N, C, arr));

    }

    public int solution(int n, int c, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr, mid) >=c){
                answer=mid;
                lt=mid+1;
            }
            else rt=mid-1;
        }
        return answer;
    }

    public int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep>=dist){
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

}
