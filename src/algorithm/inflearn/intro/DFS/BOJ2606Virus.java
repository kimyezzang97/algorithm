package algorithm.inflearn.intro.DFS;

import java.util.Scanner;

// 백준 2606 바이러스 (DFS) - silver 3
public class BOJ2606Virus {
    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;
        answer++;

        for(int i=1; i <=N; i++){
            if(visited[i] == false && graph[idx][i]) dfs(i);
        }
    }
    public static void main(String[] args) {
        // 0. 입력 및 초기화
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];

        // 1. graph 연결 정보 채우기
        int x, y;
        for(int i=0; i<M; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. dfs(재귀함수) 호출
        dfs(1);

        // 3. 출력
        System.out.println(answer - 1);
    }
}
