package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-2. 보이는 학생
public class SeeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = sc.nextInt();
        }
        int result = 1;
        int max = arr[0];
        for(int i=1; i<cnt; i++){
            if(arr[i] > max){
                result++;
                max = arr[i];
            }
        }
        System.out.println(result);
    }
}
