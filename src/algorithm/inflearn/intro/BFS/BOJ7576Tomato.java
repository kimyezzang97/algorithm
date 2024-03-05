package algorithm.inflearn.intro.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 7576 토마토 (BFS) - gold5
class Point2{
    int x;
    int y;
    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BOJ7576Tomato {
    final static int MAX = 1000 + 10;
    static int M, N, answer;
    static int[][] graph;
    static int[] arrX = {-1, 1, 0, 0};
    static int[] arrY = {0, 0, -1, 1};
    static Queue<Point2> Q = new LinkedList<>();
    public static void BFS(){
        while(!Q.isEmpty()){
            Point2 tmp = Q.poll();
            for(int i=0; i<4; i++){
                int dirX = tmp.x + arrX[i];
                int dirY = tmp.y + arrY[i];
                if(dirX >=1 && dirX <= N && dirY >=1 && dirY <= M && graph[dirX][dirY] == 0){
                    graph[dirX][dirY] = graph[tmp.x][tmp.y] + 1;
                    Q.add(new Point2(dirX, dirY));
                }
            }
        }
    }
    public static void main(String[] args) {
        // 초기 선언
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 가로 개수
        N = sc.nextInt(); // 세로 개수

        answer = 0;

        graph = new int[MAX][MAX];

        // 입력 받기
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                int t = sc.nextInt();
                if(t == 1) Q.add(new Point2(i, j));
                graph[i][j] = t;
            }
        }

        // BFS 호출
        BFS();

        // 정답 출력
        boolean status = true;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                if(graph[i][j] == 0) status = false;
                answer = Math.max(answer, graph[i][j]);
            }
        }

        if(status) System.out.println(answer-1);
        else System.out.println(-1);

    }



}
