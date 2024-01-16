package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-9. 격자판 최대합
public class MaxSumCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] arr = new int[cnt][cnt];
        for(int i=0; i<cnt; i++){
            for(int j=0; j<cnt; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int width = 0;
        int height = 0;
        int cross = 0;
        for(int i=0; i<cnt; i++){
            cross += arr[i][cnt-1-i];
        }
        int tempC = 0;
        for(int i=0; i<cnt; i++){
            int tempW = 0;
            int tempH = 0;
            for(int j=0; j<cnt; j++){
                tempW += arr[i][j];
            }
            for(int j=0; j<cnt; j++){
                tempH += arr[j][i];
            }
            tempC += arr[i][i];
            if(tempW > width) width = tempW;
            if(tempH > height) height = tempH;
        }
        if(tempC > cross) cross = tempC;
        System.out.println(Math.max(Math.max(width,height),cross));
    }
}
