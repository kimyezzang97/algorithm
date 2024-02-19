package algorithm.inflearn.intro.greedy;

// 백준 1931 회의실배정 (Greedy) - silver 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int s;
    int e;
    Time(int s, int e){
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o){
        if(this.e==o.e) return this.s-o.s; // 끝나는 시간이 같으면 시작시간 순으로 오름 차순
        else return this.e-o.e; // 끝나는 시간이 같지 않으면 끝나는 시간으로 오름 차순
    }
}

public class BOJ1931MeetingRoom {
    public static int solution(List<Time> list){
        int cnt = 0;
        Collections.sort(list);
        int et = 0;
        for(Time o : list){
            if(o.s >= et){
                cnt++;
                et = o.e;
            }
        }
        return cnt;
    }
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(solution(list));
    }
}
