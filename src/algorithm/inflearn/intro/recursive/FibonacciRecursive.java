package algorithm.inflearn.intro.recursive;

// 7-4. 피보나치 재귀 (메모이제이션)
public class FibonacciRecursive {
    static int[] fibo;
    public static void main(String[] args) {
        FibonacciRecursive T = new FibonacciRecursive();
        int n = 45;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }

    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2) + DFS(n-1);
    }
}
// 결과 : 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597...
