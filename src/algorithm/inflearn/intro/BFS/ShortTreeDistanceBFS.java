package algorithm.inflearn.intro.BFS;

import java.util.LinkedList;
import java.util.Queue;

// 7-10. Tree 말단 노드까지의 가장 짧은 경로(BFS)
class Node7_10{
    int data;
    Node7_10 lt, rt;
    public Node7_10(int val){
        this.data = val;
        lt = rt = null;
    }
}
public class ShortTreeDistanceBFS {
    Node7_10 root;
    public int BFS(Node7_10 root){
        Queue<Node7_10> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                Node7_10 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        ShortTreeDistanceBFS tree = new ShortTreeDistanceBFS();
        tree.root = new Node7_10(1);
        tree.root.lt = new Node7_10(2);
        tree.root.rt = new Node7_10(3);
        tree.root.lt.lt = new Node7_10(4);
        tree.root.lt.rt = new Node7_10(5);
        System.out.println(tree.BFS(tree.root));
    }
}
