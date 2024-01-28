package algorithm.inflearn.intro.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 백준 24479 알고리즘 수업 - (DFS) - silver2
public class BOJ24479 {
    final static int MAX = 100000 + 10;
    static int N, M, R;
    static int[] answer;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int order;

    public static void DFS(int idx){
        visited[idx] = true;
        answer[idx] = order++;

        for(int i=0; i<graph[idx].size(); i++){
            int next = graph[idx].get(i);
            if(visited[next] == false) {
                DFS(next);
            }
        }
    }

    public static void main(String[] args) {
        // 0. 초기 선언
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // Node 갯수
        M = sc.nextInt(); // Edge 갯수
        R = sc.nextInt(); // 시작 순서

        order = 1;
        answer = new int[MAX];
        graph = new ArrayList[MAX];
        visited = new boolean[MAX];

        for(int i=1; i<=N; i++){
            graph[i] = new ArrayList<>();
        }

        // 1. 입력 받기
        for(int i=1; i<=M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        // 2.오름차순 정렬
        for(int i=1; i<=N; i++){
            Collections.sort(graph[i]);
        }

        // 3. 재귀 호출
        DFS(R);

        for(int i=1; i<=N; i++) System.out.println(answer[i]);
    }
}
