package algorithm.inflearn.intro.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 6-6. 장난 꾸러기
public class Mischievous {
    public static void main(String[] args) {
        Mischievous T = new Mischievous();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : T.solution(arr)) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        for(int i=0; i<arr.length; i++){
            if(arr[i] != temp[i]) list.add(i+1);
        }

        return list;
    }

}
