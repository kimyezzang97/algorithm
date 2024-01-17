package algorithm.inflearn.intro.HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

// 4-3. 매출액의 종류
public class TypeOfSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int selected = sc.nextInt();
        int[] arr = new int[days];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        TypeOfSales T = new TypeOfSales();
        T.solution(days, selected, arr);
    }

    public void solution(int days, int selected, int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0, lt = 0;
        for(int i=0; i<days; i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i]) + 1);
            else map.put(arr[i], 1);

            if(i>=selected-1){
                System.out.print(map.size() + " ");
                if(map.containsKey(arr[lt])){
                    if(map.get(arr[lt]) >= 2) map.put(arr[lt], map.get(arr[lt]) - 1);
                    else map.remove(arr[lt]);
                } //else map.remove(arr[lt]);
                lt++;
            }
        }
    }
}
