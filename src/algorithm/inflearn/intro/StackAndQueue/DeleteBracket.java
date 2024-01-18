package algorithm.inflearn.intro.StackAndQueue;


import java.util.Scanner;
import java.util.Stack;

// 5-2. 괄호 문자 제거
public class DeleteBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') cnt++;
            else if(str.charAt(i) == ')') cnt--;
            else {
                if(cnt == 0) answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
/**
 * lecture answer
 * Stack<Character> stack =new Stack<>();
 *         for(char x : str.toCharArray()){
 *             if(x==')'){
 *                 while(stack.pop() != '(');
 *             } else stack.push(x);
 *         }
 *         for(int i=0; i<stack.size(); i++) answer += stack.get(i);
 */