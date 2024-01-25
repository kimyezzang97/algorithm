package algorithm.inflearn.intro.BFS;

import algorithm.inflearn.intro.DFS.BinaryTreeDFS;

import java.util.LinkedList;
import java.util.Queue;

// 7-7. 이진트리 레벨탐색 (BFS)
class Node {
    int data;
    Node lt, rt;
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}
public class BinaryTreeLevel {
    Node root;
    public void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BinaryTreeLevel tree = new BinaryTreeLevel();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}

/**
 * 0 : 1
 * 1 : 2 3
 * 2 : 4 5 6 7
 */