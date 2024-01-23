package algorithm.inflearn.intro.recursive;


// 7-3. 팩토리얼
public class FactorialRecursive {
    public static void main(String[] args) {
        FactorialRecursive T = new FactorialRecursive();
        T.DFS(5);
    }

    public int DFS(int n){
        if(n == 1) return 1;
        else return  n*DFS(n-1);
    }
}
