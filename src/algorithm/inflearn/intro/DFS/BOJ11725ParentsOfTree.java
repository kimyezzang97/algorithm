package algorithm.inflearn.intro.DFS;

import java.util.ArrayList;
import java.util.Scanner;

// 백준 11725 촌수계산(DFS) - silver2
public class BOJ11725ParentsOfTree {
    final static int MAX = 100000 + 10;
    static int N, M;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static int[] answer;
    public static void DFS(int idx){
        visited[idx] = true;
        for(int i=0; i<graph[idx].size(); i++){
            int next = graph[idx].get(i);
            if(visited[next] == false){
                DFS(next);
                answer[next] = idx;
            }
        }
    }

    public static void main(String[] args) {
        // 초기 선언
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // node 갯수
        M = N - 1; // Edge 갯수

        graph = new ArrayList[MAX];
        for(int i=1; i<=N; i++) graph[i] = new ArrayList<>();
        answer = new int[MAX];
        visited = new boolean[MAX];

        for(int i=0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        // DFS
        DFS(1);

        // 출력
        for(int i=2; i<=N; i++) System.out.println(answer[i]);
    }
}
