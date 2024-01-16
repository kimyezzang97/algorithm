package algorithm.inflearn.intro.array;

import java.util.Arrays;
import java.util.Scanner;

// 2-10. 봉우리
public class Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size+2][size+2];
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                int tmp = arr[i][j];
                if(tmp > arr[i][j-1] && tmp > arr[i-1][j] && tmp > arr[i+1][j] && tmp > arr[i][j+1]) result++;
            }
        }
        System.out.println(result);
    }
}
