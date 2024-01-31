package algorithm.inflearn.intro.DFS;

import java.util.Scanner;

// 8-10. 미로탐색(DFS)
public class MazeNavigation_8_10 {
    static int answer;
    static boolean[][] graph;
    static int[] arrX = {-1, 1, 0, 0};
    static int[] arrY = {0, 0, -1, 1};

    public static void DFS(int x, int y){
        if(x == 7 && y == 7) answer++;
        for(int i=0; i<4; i++){
            int dirX = x + arrX[i];
            int dirY = y + arrY[i];
            if(dirY >= 1 && dirY <= 7 && dirX >=1 && dirX <=7 && graph[dirX][dirY] == false){
                graph[dirX][dirY] = true;
                DFS(dirX, dirY);
                graph[dirX][dirY] = false;
            }
        }
    }
    public static void main(String[] args) {
        // 초기선언
        Scanner sc = new Scanner(System.in);
        answer = 0;
        graph = new boolean[8][8];

        // 값 입력
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                int t = sc.nextInt();
                if(t == 1) graph[i][j] = true;
            }
        }

        // DFS 호출
        graph[1][1] = true;
        DFS(1, 1);

        // 출력
        System.out.println(answer);
    }
}
