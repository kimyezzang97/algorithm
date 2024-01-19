package algorithm.inflearn.intro.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 6-5. 중복 확인
public class DuplicationCheck {
    public static void main(String[] args) {
        DuplicationCheck T = new DuplicationCheck();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }

    public String solution(int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]) return "D";
        }
        return answer;
    }
}
