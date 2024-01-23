package algorithm.inflearn.intro.recursive;

// 이진수 출력(재귀)
public class BinaryOutput {
    public static void main(String[] args) {
        BinaryOutput T = new BinaryOutput();
        T.DFS(11);
    }

    public void DFS(int n){
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }
}
// 출력 : 1 0 1 1
