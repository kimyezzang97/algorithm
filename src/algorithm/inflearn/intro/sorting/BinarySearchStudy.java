package algorithm.inflearn.intro.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 6-8. 이분 검색(이진탐색 BinarySearch)
public class BinarySearchStudy {
    public static void main(String[] args) {
        BinarySearchStudy T = new BinarySearchStudy();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }
            if(arr[mid]>m) rt=mid-1;
            else lt=mid+1;
        }
        return answer;
    }
}
