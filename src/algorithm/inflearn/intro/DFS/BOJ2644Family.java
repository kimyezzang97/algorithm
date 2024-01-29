package algorithm.inflearn.intro.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 백준 2644 촌수계산(DFS) - silver2
public class BOJ2644Family {
    static int N, M, start, end;
    final static int MAX = 100 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int answer;

    public static void DFS(int idx, int cnt){
        visited[idx] = true;
        if(idx == end){
            answer = cnt;
            return;
        }
        for(int i=0; i<graph[idx].size(); i++){
            int next = graph[idx].get(i);
            if(visited[next] == false){
                DFS(next, cnt+1);
            }
        }

    }
    public static void main(String[] args) {
        // 초기 선언
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // Node 갯수
        start = sc.nextInt();
        end = sc.nextInt();
        M = sc.nextInt(); // 간선 갯수

        visited = new boolean[MAX];
        graph = new ArrayList[MAX];
        answer = -1;

        for(int i=1; i<=N; i++) graph[i] = new ArrayList<>();

        for(int i=0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        // 정렬
        for(int i=1; i<=N; i++) Collections.sort(graph[i]);

        // DFS 호출
        DFS(start, 0);

        // 출력
        System.out.println(answer);
    }
}
