package algorithm.inflearn.intro.twoPointer;

import java.util.Scanner;

// 3-5. 연속된 자연수의 합
public class ContinuitySum {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        int lt = 1;
        for(int rt=1; rt<=num/2+1; rt++){
            sum+=rt;
            if(sum==num) result++;
            while(sum>=num){
                sum -= lt++;
                if(sum==num) result++;
            }
        }

        System.out.println(result);
    }
}
