package algorithm.inflearn.intro.DFS;

import java.util.Scanner;

// 백준 4963 섬의 개수 (DFS) - silver2
public class BOJ4963CountOfLands {
    final static int MAX = 50 + 10;
    static int N, M;
    static int[][] graph;
    static int[] arrX = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[] arrY = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static void DFS(int x, int y){
        graph[x][y] = 0;
        for(int i=0; i<8; i++){
            int dirX = x + arrX[i];
            int dirY = y + arrY[i];
            if(graph[dirX][dirY] == 1){
                DFS(dirX, dirY);
            }
        }
    }
    public static void main(String[] args) {
        // 초기 선언
        Scanner sc = new Scanner(System.in);

        while(true){
            N = sc.nextInt(); // 가로 개수
            M = sc.nextInt(); // 세로 개수
            graph = new int[MAX][MAX];
            int answer = 0;

            // 값 빋기
            for(int i=1; i<=M; i++){
                for(int j=1; j<=N; j++){
                    graph[i][j] = sc.nextInt();
                }
            }

            // DFS 호출
            for(int i=1; i<=M; i++){
                for(int j=1; j<=N; j++){
                    if(graph[i][j] == 1){
                        DFS(i, j);
                        answer++;
                    }
                }
            }

            // 정답 출력
            System.out.println(answer);
        }
    }
}
