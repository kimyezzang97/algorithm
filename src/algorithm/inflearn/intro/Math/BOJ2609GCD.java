package algorithm.inflearn.intro.Math;

import java.util.Scanner;

// 백준 2609 최대공약수(GCD) - bronze1
public class BOJ2609GCD {
    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        } else {
            return GCD(b, a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = GCD(a, b);
        System.out.println(g); // 최대공약수
        System.out.println(g * (a/g) * (b/g)); // 최소공배수
    }
}

/**
 * [GCD : 최대공약수]
 * 두 수 A와 B의 최대 공약수는 A와 B의 공통된 약수 중에서 가장 큰 정수이다.
 * 최대공약수를 구하는 가장 쉬운 방법은 2부터 min(A, B)까지 모든 정수로 나누어 보는 방법이다
 * 최대공약수가 1인 두 수를 서로소(Compire)라고 한다.
 *
 * 빠른 방법으로는 유클리드 호제법이 있다.
 * a를 b로 나눈 나머지를 r이라고 했을 떄
 * GCD(a,b) = GCD(b,r)과 같다
 * r이 0이면 그 때 b가 최대공약수이다.
 *
 * GCD(24, 16) = GCD(16, 8) = GCD(8, 0) = 8
 *
 * [최소공배수]
 * 두 수 a,b의 최대공약수를 g라고 했을 때
 * 최소공배수 l = g * (a/g) * (b/g) 이다.
 */