package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-5. 소수 (에라토스테네스 체)
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int[] arr = new int[num+1];
        for(int i=2; i<=num; i++){
            if(arr[i] == 0){
                result++;
                for(int j=i; j<=num; j=j+i){arr[j]=100;}
            }
        }
        System.out.println(result);
    }
}
