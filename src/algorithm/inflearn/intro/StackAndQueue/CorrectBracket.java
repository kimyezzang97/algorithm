package algorithm.inflearn.intro.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

// 5-1. 올바른 괄호
public class CorrectBracket {
    public static void main(String[] args) {
        String answer = "YES";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int chk = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        for(int i=0; i<str.length(); i++){
            char p = stack.pop();
            if( p == ')') chk++;
            else chk--;
            if(chk < 0) answer = "NO";
        }

        if(chk != 0) answer ="NO";
        System.out.println(answer);
    }
}
/**
 * 강의 정답
 * String answer = "YES";
 * for(char x : str.toCharArray()){
 *     if(x=='(') stack.push(x);
 *     else {
 *         if(stack.isEmpty()) return "NO";
 *         stack.pop();
 *     }
 * }
 * if(!stack.isEmpty()) return"NO";
 * return answer;
 */
