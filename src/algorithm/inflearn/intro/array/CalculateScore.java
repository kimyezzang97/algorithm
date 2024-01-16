package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-7. 점수 계산
public class CalculateScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        int temp = 0;
        for(int i=0; i<cnt; i++){
            if(arr[i] == 1){
                temp++;
                result += temp;
            } else temp = 0;
        }
        System.out.println(result);
    }
}
