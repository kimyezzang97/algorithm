package algorithm.inflearn.intro.recursive;

// 7-1. 재귀함수 (스택프레임)
public class StackFrame {
    public static void main(String[] args) {
        StackFrame T = new StackFrame();
        T.DFS(3);
    }

    public void DFS(int n){
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}

// 출력 결과 : 1 2 3