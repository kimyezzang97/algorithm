package algorithm.inflearn.intro.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 9-1. 씨름선수 (Greedy)
class Body implements Comparable<Body>{
    int h; // 키
    int w; // 몸무게
    Body(int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o){
        return o.h-this.h; // 내림차순
        // 오름 차순 정렬 : this.h - o.h
    }

}
public class Wrestler_9_1 {
    public static int solution(List<Body> arr){
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Body o : arr){
            if(o.w > max){
                max = o.w;
                cnt++;
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Body(h ,w));
        }
        System.out.println(solution(list));

    }
}
