package algorithm.inflearn.intro.DFS;

// 7-5. 이진트리순회(DFS : Depth-First Search)
class Node7_5 {
    int data;
    Node7_5 lt, rt;
    Node7_5(int val){
        data = val;
        lt = rt = null;
    }
}

public class BinaryTreeDFS {
    Node7_5 root;
    void DFS(Node7_5 root){
        if(root == null) return;
        else {
            System.out.print(root.data + " "); // 전위 순회
            DFS(root.lt);
            // System.out.print(root.data + " "); // 중위 순회
            DFS(root.rt);
            // System.out.print(root.data + " "); // 후위 순회
        }
    }
    public static void main(String[] args) {
        BinaryTreeDFS tree = new BinaryTreeDFS();
        tree.root = new Node7_5(1);
        tree.root.lt = new Node7_5(2);
        tree.root.rt = new Node7_5(3);
        tree.root.lt.lt = new Node7_5(4);
        tree.root.lt.rt = new Node7_5(5);
        tree.root.rt.lt = new Node7_5(6);
        tree.root.rt.rt = new Node7_5(7);
        tree.DFS(tree.root);
    }
}
