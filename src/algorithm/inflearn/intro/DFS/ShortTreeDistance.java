package algorithm.inflearn.intro.DFS;

// 7-9. Tree 말단 노드까지의 가장 짧은 경로(DFS) 원래 최단 경로는 BFS가 맞음
class Node7_9 {
    int data;
    Node7_9 lt, rt;

    Node7_9(int val){
        data = val;
        lt=rt=null;
    }

}
public class ShortTreeDistance {
    Node7_9 root;
    public int DFS(int L, Node7_9 root){
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }
    public static void main(String[] args) {
        ShortTreeDistance tree = new ShortTreeDistance();
        tree.root = new Node7_9(1);
        tree.root.lt = new Node7_9(2);
        tree.root.rt = new Node7_9(3);
        tree.root.lt.lt = new Node7_9(4);
        tree.root.lt.rt = new Node7_9(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
