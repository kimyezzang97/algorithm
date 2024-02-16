package algorithm.inflearn.intro.DFS;

import java.util.Scanner;

// 백준 16173 점프왕 쩰리(DFS) - silver4
public class BOJ16173JumpJelly {
    static int N;
    static int[][] graph;
    static int[] arrX = {1, 0};
    static int[] arrY = {0, 1};
    public static void DFS(int x, int y){
        int tmp = graph[x][y];
        graph[x][y] = 0;
        for(int i=0; i<2; i++){
            int dirX = x + arrX[i] * tmp;
            int dirY = y + arrY[i] * tmp;
            if(dirX >= 1 && dirX <= N && dirY >= 1 && dirY <= N && tmp > 0){
                DFS(dirX, dirY);
            }
        }
    }
    public static void main(String[] args) {
        // 초기 선언
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 맵 크기
        graph = new int[N+1][N+1];

        // 입력 받기
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                graph[i][j] = sc.nextInt();
            }
        }

        // DFS 호출
        DFS(1, 1);

        // 정답 출력
        if(graph[N][N] == -1) System.out.println("Hing");
        else System.out.println("HaruHaru");
    }
}
