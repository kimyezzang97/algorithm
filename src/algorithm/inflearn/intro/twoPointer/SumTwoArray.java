package algorithm.inflearn.intro.twoPointer;

import java.util.ArrayList;
import java.util.Scanner;

// 3-1. 두 배열 합치기
public class SumTwoArray {
    public static void main(String[] args) {
        SumTwoArray T = new SumTwoArray();
        Scanner sc = new Scanner(System.in);
        int aSize = sc.nextInt();
        int[] arrA = new int[aSize];
        for(int i=0; i<aSize; i++){
            arrA[i] = sc.nextInt();
        }

        int bSize = sc.nextInt();
        int[] arrB = new int[bSize];
        for(int i=0; i<bSize; i++){
            arrB[i] = sc.nextInt();
        }

        for(int x : T.solution(aSize, bSize, arrA, arrB)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 <m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        return  answer;
    }
}
