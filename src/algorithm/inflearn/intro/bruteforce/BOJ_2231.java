package algorithm.inflearn.intro.bruteforce;

import java.util.Scanner;

// 백준 2231 분해합 (Bruteforce) - bronze 2
public class BOJ_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        for(int i=1; i<=num; i++){
            int sum = 0;
            int tmpI = i;

            while(tmpI != 0){
                sum += tmpI % 10;
                tmpI /= 10;
            }

            if(sum + i == num) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
