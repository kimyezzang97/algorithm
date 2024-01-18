package algorithm.inflearn.intro.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

// 5-3. 크레인 인형 뽑기
public class CraneDoll {
    public static void main(String[] args) {
        CraneDoll T = new CraneDoll();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] board = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int a = sc.nextInt();
        int[] moves = new int[a];
        for(int i=0; i<a; i++){
            moves[i] = sc.nextInt();
        }

        System.out.println(T.solution(board, moves));
    }

    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }
}
