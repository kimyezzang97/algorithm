package algorithm.inflearn.intro.DFS;

import java.util.Scanner;

// 백준 11724 연결 요소의 개수 (DFS) - silver2
public class BOJ11724ConnectedCount {
    final static int MAX = 1000 + 10;
    static int n, m;
    static boolean[] visited;
    static boolean[][] graph;
    static int answer;

    public static void DFS(int idx){
        visited[idx] = true;
        for(int i=1;i<=n; i++){
            if(visited[i] == false && graph[idx][i]) DFS(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // node 갯수
        m = sc.nextInt(); // edge 갯수

        visited = new boolean[MAX];
        graph = new boolean[MAX][MAX];

        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y =sc.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }

        for(int i=1; i<=n; i++){
            if(visited[i] == false){
                DFS(i);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
