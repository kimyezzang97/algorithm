package algorithm.inflearn.intro.bruteforce;

import java.util.Scanner;

// 백준 1476 날짜계산 (Bruteforce) - silver5
public class BOJ_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int E = 0;
        int S = 0;
        int M = 0;
        int sum = 0;
        while(true){
            sum++;
            E++;
            S++;
            M++;
            if(E == 16) E = 1;
            if(S == 29) S = 1;
            if(M == 20) M = 1;

            if(E == e && s == S && M == m)     break;
        }
        System.out.println(sum);
    }
}
