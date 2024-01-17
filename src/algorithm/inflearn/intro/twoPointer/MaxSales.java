package algorithm.inflearn.intro.twoPointer;

import java.util.Scanner;

// 3-3. 최대 매출액
public class MaxSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int chk = sc.nextInt();
        int max = 0;
        int[] arr = new int[days];
        for(int i=0; i<days; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<chk; i++){
            sum += arr[i];
        }
        max = sum;
        int cnt = 0;
        for(int i=chk; i<days; i++){
            sum = sum - arr[cnt++] + arr[i]; // sum = sum - arr[i-chk] + arr[i]; // 강의 정답
            if(max < sum) max = sum;
        }
        System.out.println(max);
    }
}
