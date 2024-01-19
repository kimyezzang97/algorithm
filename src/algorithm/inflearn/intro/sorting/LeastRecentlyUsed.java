package algorithm.inflearn.intro.sorting;

import java.util.Arrays;
import java.util.Scanner;

// 6-4. LRU (캐시, 카카오 변형)
public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cache = sc.nextInt();
        int[] cacheArr = new int[cache];

        int size = sc.nextInt();
        int[] sizeArr = new int[size];
        for(int i=0; i<size; i++){
            sizeArr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            int temp = sizeArr[i];
            boolean status = false;
            int cnt = 0;
            for(int j=0; j<cache; j++){
                if(cacheArr[j] == temp){
                    status = true;
                    cnt = j;
                    break;
                }
            }
            if(status){
                for(int k=cnt; k>0; k--){
                    cacheArr[k] = cacheArr[k-1];
                }
                cacheArr[0] = temp;
            }else{
                for(int k=cacheArr.length-1; k>0; k--){
                    cacheArr[k] = cacheArr[k-1];
                }
                cacheArr[0] = temp;
            }
        }

        for(int i=0; i<cache; i++){
            System.out.print(cacheArr[i] +" ");
        }
    }

    /**
     * 강의 정답
     */
    public int[] solution(int size, int n, int[] arr){
        int[] cache = new int[size];
        for(int x : arr){
            int pos = -1;
            for(int i=0;i<size; i++){
                if(x == cache[i]) pos = i;
            }
            if(pos == -1){
                for(int i=size-1; i>=-1; i--){
                    cache[i] = cache[i-1];
                }
            }
            else {
                for(int i=pos; i>=i; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return  cache;
    }
}
