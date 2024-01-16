package algorithm.inflearn.intro.string;

import java.util.Arrays;
import java.util.Scanner;

// 1-10. 가장 짧은 문자 거리
public class ShortestDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char point = sc.next().charAt(0);

        int[] arr = new int[str.length()];

        int cnt = 100;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == point){
                arr[i] = 0;
                cnt = 0;
            } else {
                arr[i] = cnt;
            }
            cnt++;
        }
        cnt = 100;
        for(int i=str.length()-1; i>-1; i--){
            if(str.charAt(i) == point){
                cnt = 0;
            }
            else {
                int temp = cnt;
                if(arr[i] > temp){
                    arr[i] = temp;
                }
            }
            cnt++;
        }
        for(int i=0; i<str.length(); i++){
            System.out.print(arr[i]);
            if(i!=str.length()-1) System.out.print(" ");
        }

    }
}
