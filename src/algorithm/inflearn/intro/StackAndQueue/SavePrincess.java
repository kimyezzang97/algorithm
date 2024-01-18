package algorithm.inflearn.intro.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 5-6. 공주 구하기
public class SavePrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=K; i++){
            queue.add(i);
        }
        while(queue.size() != 1){
            for(int i=0; i<N; i++){
                if(i == N-1) queue.poll();
                else queue.add(queue.poll());
            }
        }
        System.out.println(queue.poll());
    }
}
