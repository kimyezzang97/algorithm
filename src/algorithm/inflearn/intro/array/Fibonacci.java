package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-4. 피보나치 수열
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            if(i == 0 || i == 1) arr[i] = 1;
            else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        for(int i=0; i<cnt; i++){
            System.out.print(arr[i]);
            if(i != cnt-1) System.out.print(" ");
        }
    }
}
