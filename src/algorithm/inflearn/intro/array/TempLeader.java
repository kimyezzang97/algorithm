package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-11. 임시 반장 정하기
public class TempLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][5];
        int[] students = new int[size];
        for(int i=0; i<size; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                for(int k=0;k<5;k++){
                    if(i != j){
                        if(arr[i][k] == arr[j][k]) {
                            students[i] += 1;
                            break;
                        }
                    }
                }
            }
        }

        int max = 0;
        int cnt = 0;
        for(int i=0; i<students.length; i++){
            if(max < students[i]) {
                max = students[i];
                cnt = i;
            }
        }
        System.out.println(cnt+1);
    }
}
