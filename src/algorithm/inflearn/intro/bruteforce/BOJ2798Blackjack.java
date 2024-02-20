package algorithm.inflearn.intro.bruteforce;

import java.util.Scanner;

// 백준 2798 블랙잭 (Bruteforce) - bronze 2
public class BOJ2798Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int answer = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i=0; i<cnt; i++){
            for(int j=i+1; j<cnt; j++){
                for(int k=j+1; k<cnt; k++){
                    int tmp = arr[i] + arr[j] + arr[k];
                    if(tmp <= answer && max < tmp){
                        max = tmp;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
