package algorithm.inflearn.intro.sorting;

import java.util.Scanner;

// 6-2. 버블 정렬
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort T = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }

    public int[] solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
               if(arr[j] > arr[j+1]){
                   int tmp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = tmp;
               }
            }
        }
        return arr;
    }
}
