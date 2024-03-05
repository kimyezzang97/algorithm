package algorithm.inflearn.intro.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Maze_8_11 {
    static int[][] graph, dir;
    static int[] arrX = {-1, 1, 0, 0};
    static int[] arrY = {0, 0, -1, 1};
    public static void BFS(int x, int y){
        Queue<Point> Q = new LinkedList<>();
        Q.add(new Point(x, y));
        graph[x][y] = 1;
        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i=0; i<4; i++){
                int dirX = tmp.x + arrX[i];
                int dirY = tmp.y + arrY[i];
                if(dirX >=1 && dirX<=7 && dirY >=1 && dirY <= 7 && graph[dirX][dirY] == 0){
                    graph[dirX][dirY] =1;
                    Q.add(new Point(dirX, dirY));
                    dir[dirX][dirY] = dir[tmp.x][tmp.y] +1;
                }
            }
        }
    }
    public static void main(String[] args) {
        // 초기 선언
        Scanner sc = new Scanner(System.in);
        graph = new int[8][8];
        dir = new int[8][8];

        // 값 입력
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                graph[i][j] = sc.nextInt();
            }
        }

        // BFS 호출
        BFS(1, 1);

        // 정답 출력
        if(dir[7][7] == 0) System.out.println(-1);
        else System.out.println(dir[7][7]);
    }
}
