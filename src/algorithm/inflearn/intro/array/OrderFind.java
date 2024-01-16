package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-8. 등수 구하기
public class OrderFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<count; i++){
            int chk = 1;
            for(int j=0; j<count; j++){
                if(i!=j){
                    if(arr[i] < arr[j]) chk++;
                }
            }
            System.out.print(chk);
            if(i != count-1)System.out.print(" ");
        }
    }
}
