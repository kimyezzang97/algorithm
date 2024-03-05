package algorithm.inflearn.intro.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

// 백준 2309 일곱 난쟁이 (Bruteforce) - bronze 1
public class BOJ_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];

        // 입력
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        // 구현
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int sum = 0;
                for(int k=0; k<N; k++){
                    if(i == k || j == k) continue; // 난쟁이 i, j번 빼고 나머지 키들을 합치기 위해 continue;
                    sum += arr[k]; // 난쟁이 키들 합치기
                }
                if(sum == 100){// 키 합이 100이면
                    for(int k=0; k<N; k++){
                        if(i == k || j == k) continue;
                        // 정답 출력
                        System.out.println(arr[k]);
                    }
                    System.exit(0); // 종료
                }
            }
        }

    }
}
