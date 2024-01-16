package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-3. 가위바위보
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr1 = new int[cnt];
        int[] arr2 = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<cnt; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i=0; i<cnt; i++){
            if(arr1[i] == arr2[i]) System.out.println("D");
            else if(arr1[i] == 1 && arr2[i] == 3) System.out.println("A");
            else if(arr1[i] == 2 && arr2[i] == 1) System.out.println("A");
            else if(arr1[i] == 3 && arr2[i] == 2) System.out.println("A");
            else System.out.println("B");
        }
    }
}
