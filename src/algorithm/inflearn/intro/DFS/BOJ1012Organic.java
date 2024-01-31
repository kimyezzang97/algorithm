package algorithm.inflearn.intro.DFS;

import java.util.Scanner;

// 백준 1012 유기농 배추(DFS) - silver2
public class BOJ1012Organic {
    final static int MAX = 50 + 10;
    static int T, M, N, K;
    static boolean[][] graph;
    static int[] arrX = {0, -1, 0, 1};
    static int[] arrY = {-1, 0, 1, 0};

    public static void DFS(int x, int y){
        graph[x][y] = false;
        for(int i=0; i<4; i++){
            int dirX = x + arrX[i];
            int dirY = y + arrY[i];
            if(graph[dirX][dirY]){
                DFS(dirX, dirY);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while(T-- > 0){
            // 초기 입력
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            int answer = 0;

            graph = new boolean[MAX][MAX];
            for(int i=0; i<K; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x+1][y+1] = true;
            }

            // DFS 호출
            for(int i=1; i<=M; i++){
                for(int j=1; j<=N; j++){
                    if(graph[i][j]){
                        DFS(i, j);
                        answer++;
                    }
                }
            }

            // 출력
            System.out.println(answer);
        }
    }
}
