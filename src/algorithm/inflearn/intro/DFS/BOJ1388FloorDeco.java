package algorithm.inflearn.intro.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 1388 바닥장식 (DFS) - silver 4
public class BOJ1388FloorDeco {
    final static int MAX = 50 + 10;
    static int N, M;
    static char[][] graph;
    static boolean[][] visited;
    static int answer;
    public static void DFS(int y, int x){
        visited[y][x] = true;

        if(graph[y][x] == '-' && graph[y][x+1] == '-') DFS(y, x+1);
        if(graph[y][x] == '|' && graph[y+1][x] == '|') DFS(y+1, x);

    }
    public static void main(String[] args) throws IOException {
        // 초기 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 세로 길이
        M = Integer.parseInt(st.nextToken()); // 가로 길이

        graph = new char[MAX][MAX];
        visited = new boolean[MAX][MAX];

        answer = 0;

        // 입력 받기
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            for(int j=1; j<=M; j++){
                graph[i][j] = str.charAt(j-1);
            }
        }

        // DFS 호출
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(visited[i][j] == false){
                    DFS(i, j);
                    answer++;
                }
            }
        }

        // 정답 출력
        System.out.println(answer);
    }
}
