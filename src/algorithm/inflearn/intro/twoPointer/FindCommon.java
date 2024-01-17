package algorithm.inflearn.intro.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// 3-2. 공통원소 구하기
public class FindCommon {
    public static void main(String[] args) {
        FindCommon T = new FindCommon();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrA = new int[a];
        for(int i=0; i<a; i++){
            arrA[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arrB = new int[b];
        for(int i=0; i<b; i++){
            arrB[i] = sc.nextInt();
        }

        for(int x : T.solution(a, b, arrA, arrB)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            } else if(a[p1]<b[p2]){
                p1++;
            } else p2++;
        }
        return answer;
    }
}
